package com.xqoa.task;

import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;

import java.util.LinkedList;

/**
 * @ClassName TaskQueue
 * @Author dell
 * @Date: 2018/5/26 10:41
 * @Description: TODD
 * @Version 1.0
 */
public class TaskQueue {

    /**
     * 线程池的大小
     */
    private final int nThreads;
    /**
     * 用数组实现线程池
     */
    private final PoolWorker[] threads;
    /**
     * 任务队列
     */
    private final LinkedList queue;

    public TaskQueue(int nThreads) {
        this.nThreads = nThreads;
        queue = new LinkedList();
        threads = new PoolWorker[nThreads];

        for (int i = 0; i < nThreads; i++) {
            threads[i] = new PoolWorker();
            // 启动所有工作线程
            threads[i].start();
        }
    }

    /**
     * // 执行任务
     * @param r
     */
    public void execute(Runnable r) {
        synchronized (queue) {
            queue.addLast(r);
            queue.notify();
        }
    }

    /**
     *  // 工作线程类
     */
    private class PoolWorker extends Thread {
        @Override
        public void run() {
            Runnable r;
            while (true) {
                synchronized (queue) {
                    // 如果任务队列中没有任务，等待
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException ignored) {
                        }
                    }
                    // 有任务时，取出任务
                    r = (Runnable) queue.removeFirst();
                }
                try {
                    r.run();// 执行任务
                } catch (RuntimeException e) {
                    // You might want to log something here
                }
            }
        }
    }

    public static void main(String args[]) {
        // 10个工作线程
        TaskQueue wq = new TaskQueue(10) ;
        // 20个任务
        Mytask []r = new Mytask[20];

        for (int i = 0; i < 20; i++) {
            r[i] = new Mytask();
            wq.execute(r[i]);
        }
    }
}

class Mytask implements Runnable {// 任务接口

    /**
     *
     */
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            // 模拟任务执行的时间
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.println(name + " executed OK");
    }

}
