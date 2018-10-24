package com.thssh.java.executor;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.RecursiveAction;

/**
 * 将一个大的Task拆分(fork)成多个小的Task， 最后将结果合并(join)
 */
public class T_ForkJoinPool {

    static int[] nums = new int[100*10000];
    static final int MAX_NUM = 5 * 10000;
    static Random r = new Random();

    static {
        for(int i = 0; i< nums.length; i++){
            nums[i] = r.nextInt(100);
        }

        System.out.println(Arrays.stream(nums).sum());
    }

    static class AddTask extends RecursiveAction{
        int start, end;

        public AddTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if(end - start <= MAX_NUM){
                long sum = 0L;
                System.out.println("from: " + start + " to " + end + " = " + sum);
            }else{
                int middle = start + (end-start)/2;
                AddTask subTask1 = new AddTask(start, middle);
                AddTask subTask2 = new AddTask(middle, end);
                subTask1.fork();
                subTask2.fork();
            }
        }
    }
}
