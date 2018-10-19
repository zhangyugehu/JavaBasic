package com.thssh.java;

import com.thssh.kotlin.download.Downloader;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class Main {
    public static void main(String[] args){
        new Downloader().down("https://i0.hdslb.com/bfs/album/c057320a19739ec2d123b09b0bdcc422c83bfe79.jpg", "", new Downloader.CallBack(){
            @Override
            public void onFailure(@NotNull String url, @NotNull String error) {

            }

            @Override
            public void onProgress(@NotNull String url, int process) {

            }

            @Override
            public void onSuccess(@NotNull String url, @NotNull File file) {

            }

            @Override
            public void onReady(@NotNull String url) {

            }

            @Override
            public void onPreExecute(@NotNull String url) {

            }
        }, "D:/download/java");
    }
}
