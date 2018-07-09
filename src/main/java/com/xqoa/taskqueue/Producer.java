package com.xqoa.taskqueue;

import com.xqoa.task.Task;

import java.util.Queue;

/**
 * @ClassName Producer
 * @Author dell
 * @Date: 2018/5/26 14:16
 * @Description: TODD
 * @Version 1.0
 */
public class Producer implements Runnable{

    private final Queue<Task> queue;

    private final static int MAX_SIZE = 200;

    Producer(Queue<Task> q){
        queue = q;
    }


    @Override
    public void run(){
        synchronized (queue){
            // 如果缓冲区满，该线程释放queue锁，等待
            while (queue.size() >= MAX_SIZE){
                try{
                    queue.wait();
                }
                catch (InterruptedException e){
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            // 如果缓冲区不满，则继续添加任务
            queue.add(new Task());
            System.out.println("增加了一个任务，当前任务总数为 " + queue.size());
            // 添加任务以后，通知所有处于等待状态的线程
            queue.notifyAll();
        }
    }
}
