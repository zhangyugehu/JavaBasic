package com.thssh.java.executor;

import java.util.concurrent.*;

public class T_Future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(()->{
            TimeUnit.SECONDS.sleep(2);
            return "done.";
        });

        future_02();
    }

    private static void future_01(FutureTask<String> task) throws ExecutionException, InterruptedException {
        new Thread(task).start();

        System.out.println("task started.");

        System.out.println("isDone: " + task.isDone());
        System.out.println("Future Result: " + task.get());

        System.out.println("after get");

        System.out.println("isDone: " + task.isDone());
        System.out.println("ReGet Future Result: " + task.get());
    }

    private static void future_02() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<String> submit = service.submit(()->{
            TimeUnit.SECONDS.sleep(5);
            return "done.";
        });

        System.out.println("task started.");

        System.out.println("isDone: " + submit.isDone());
        System.out.println(submit.get());
        System.out.println("after get");

        System.out.println("isDone: " + submit.isDone());
        System.out.println("ReGet Future Result: " + submit.get());

        service.shutdown();
    }
}
