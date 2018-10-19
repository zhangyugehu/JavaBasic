package com.thssh.download

import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import java.util.*

class Downloader {
    internal constructor(){}
    internal constructor(renameHandler: IRenameHandler){
        this.mRenameHandler = renameHandler
    }
    private val mExecutor:ThreadPool = ThreadPool.get()
    private var mRenameHandler:IRenameHandler
    init {
        mRenameHandler = DefaultRenameHandler()
    }

    fun downList(urls: List<String>, filename:String, callback:CallBack, dir: String){
        for (url in urls){
            down(url, filename, callback, dir)
        }
        mExecutor.shutdown()
    }

    fun down(url: String, name:String, callback:CallBack, dir: String="D:/download/"){
        val dirFile = File(dir)
        if(!dirFile.exists()){
            dirFile.mkdirs()
        }
//        val filename = if(name.trim() != "") name else mRenameHandler.rename(url)
//        val file = File(dir, filename)
//        if(file.exists()) {
//            callback.onSuccess(url, file)
//            return
//        }
        callback.onPreExecute(url)
        mExecutor.execute(Runnable {
            var connection:HttpURLConnection? = null
            try {
                callback.onReady(url)
                connection = URL(url).openConnection() as HttpURLConnection
                connection.requestMethod = "GET"
                connection.connect()
                if(connection.responseCode == HttpURLConnection.HTTP_OK){
                    val headerFields = connection.headerFields
                    var contentLengthStr:String = headerFields["Content-Length"]?.get(0) ?: "-1"
                    var contentType: String = headerFields["Content-Type"]?.get(0) ?: ""
                    val typeIdx = contentType.indexOf("/")
                    contentType = if(typeIdx != -1) contentType.substring(typeIdx + 1) else contentType

                    var filename = if(name.trim() != "") name else mRenameHandler.rename(url)
                    if(contentType != "") filename = "$filename.$contentType"
                    val file = File(dir, filename)
                    val contentLength = if(contentLengthStr=="-1") file.length() else contentLengthStr.toLong()
                    if(file.exists() && file.length() == contentLength) {
                        callback.onSuccess(url, file)
                        return@Runnable
                    }

                    writeFile(url, FileOutputStream(file), connection.inputStream, callback)
                    callback.onSuccess(url, file)
                }else{
                    callback.onFailure(url,  "Connection Error. ErrorCode: ${connection.responseCode}")
                }
            }catch (e:Exception){
                callback.onFailure(url,  "Exception Error. ErrorMsg: ${e.message}")
            }finally {
                if(connection != null) {
                    try {
                        connection.inputStream.close()
                        connection.disconnect()
                    }catch (e: Exception){}
                }
            }
        })
    }

    private fun writeFile(url:String, fos: FileOutputStream, nis: InputStream, callback:CallBack){
        val buf = ByteArray(1024 * 8)
        var len = nis.read(buf)
        var mount = 0
        while (len != -1){
            mount += len
            callback.onProgress(url, mount)
            fos.write(buf, 0, len)
            len=nis.read(buf)
        }
        fos.flush()
        fos.close()
    }

    class SameLengthNameHandler(defaultSuffix:String) : IRenameHandler{

        private val defaultSuffix=defaultSuffix
        override fun rename(url: String): String {
            var filename = url
            val endInx = filename.indexOf("?")
            if(endInx > -1) filename = filename.substring(0, endInx)
            filename = filename.substring(filename.lastIndexOf("/")+1)
            val suffixIdx = filename.lastIndexOf(".");
            var suffix = this.defaultSuffix
            if(suffixIdx > -1) {
                suffix = filename.substring(suffixIdx+1)
                filename = filename.substring(0, suffixIdx)
            }
            filename += UUID.randomUUID().toString().replace("-", "")
            filename = "${filename.substring(0, 32)}.$suffix"
            return filename
        }
    }
    class DefaultRenameHandler : IRenameHandler{

        override fun rename(url: String): String {
            var filename = url
            val endInx = filename.indexOf("?")
            if(endInx > -1) filename = filename.substring(0, endInx)
            if(filename.endsWith("/")) filename= filename.substring(0, filename.length-2)
            filename = filename.substring(filename.lastIndexOf("/")+1)
            return filename
        }
    }
    interface IRenameHandler{
        fun rename(url: String):String
    }
    interface CallBack{
        fun onPreExecute(url: String){}
        fun onReady(url: String){}
        fun onSuccess(url: String, file:File)
        fun onProgress(url: String, process: Int){}
        fun onFailure(url: String, error:String)
    }
}