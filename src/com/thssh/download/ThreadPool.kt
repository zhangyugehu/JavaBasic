package com.thssh.download

import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

class ThreadPool private constructor(){

    private val executor:ThreadPoolExecutor


    init {
        println(CPU_COUNT)
        executor = ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAXIMUM_POOL_SIZE,
                KEEP_ALIVE_SECONDS,
                TimeUnit.SECONDS,
                sPoolWorkQueue,
                ThreadPoolExecutor.CallerRunsPolicy()
        )
    }

    fun execute(r: Runnable){
        executor.execute(r)
    }

    fun shutdown(){
        executor.shutdown()
    }
    fun shutdownNow(){
        executor.shutdownNow()
    }

    private object Inner{
        val instance by lazy { ThreadPool() }
    }
    companion object {
        fun get(): ThreadPool {
            return Inner.instance
        }

        private val CPU_COUNT = Runtime.getRuntime().availableProcessors()/2
        private val CORE_POOL_SIZE: Int = CPU_COUNT
        private const val MAXIMUM_POOL_SIZE: Int = 128
        private const val KEEP_ALIVE_SECONDS: Long = 1
        private val sPoolWorkQueue = LinkedBlockingQueue<Runnable>()
    }

}