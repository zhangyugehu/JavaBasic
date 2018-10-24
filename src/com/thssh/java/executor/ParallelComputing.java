package com.thssh.java.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelComputing {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        long startTime = System.currentTimeMillis();
        service.submit(new MyTask(0, 99999)).get();
        service.submit(new MyTask(100000, 149999)).get();
        service.submit(new MyTask(150000, 299999)).get();
        service.submit(new MyTask(300000, 349999)).get();
        service.submit(new MyTask(350000, 399999)).get();
        System.out.println("run in " + (System.currentTimeMillis() - startTime));
        service.shutdown();
    }


    static class MyTask implements Callable<List<Integer>>{

        private int start;
        private int end;

        public MyTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public List<Integer> call() throws Exception {
            List<Integer> primes = getPrime(start, end);
            return primes;
        }
    }

    static boolean isPrime(int num){
        for(int i=2; i<= num/2; i++){
            if(num%i==0) return false;
        }
        return true;
    }


    static List<Integer> getPrime(int start, int end){
        List<Integer> results = new ArrayList<>(end - start);
        for(int i=start; i<=end; i++){
            if(isPrime(i)) results.add(i);
        }

        return results;
    }
}
