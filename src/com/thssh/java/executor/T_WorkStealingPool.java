package com.thssh.java.executor;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class T_WorkStealingPool {

    public static void main(String[] args) throws IOException {
        // 每个线程位置一个任务队列，如果提前执行完回去其他任务队列偷取任务执行
        ExecutorService service = Executors.newWorkStealingPool(4);
        service.execute(new R(1));
        service.execute(new R(2));
        service.execute(new R(2));
        service.execute(new R(2));
        service.execute(new R(5));

        // daemon 产出的是精灵线程， 主线程不阻塞的话没有输出
        System.in.read();
    }

    static class R implements Runnable{

        int t;

        public R(int t) {
            this.t = t;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " execute " + t);
                TimeUnit.SECONDS.sleep(t);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
