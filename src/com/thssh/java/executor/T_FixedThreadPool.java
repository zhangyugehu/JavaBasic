package com.thssh.java.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class T_FixedThreadPool {
    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(5);

        for(int i=0; i<10; i++){
            service.execute(new MainThread(" "+ i));
        }



    }

    static class MainThread implements Runnable {

        private String tag;

        public MainThread(String tag) {
            this.tag = tag;
        }

        @Override
        public void run() {
            try {
                System.out.println(threadInfo() + ":" + this.tag + " is start...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println(threadInfo() + ":" + this.tag + " is done.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private String threadInfo(){
            return Thread.currentThread().getName();
        }
    }
}
