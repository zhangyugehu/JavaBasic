package com.thssh.java.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class T_ScheduledThreadPool {
    public static void main(String[] args){

        AtomicInteger counter = new AtomicInteger(0);
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        service.scheduleWithFixedDelay(()->{
            if(counter.get() == 10){
                service.shutdown();
            }
            System.out.println(counter.getAndIncrement());
        }, 1, 1, TimeUnit.SECONDS);
    }
}
