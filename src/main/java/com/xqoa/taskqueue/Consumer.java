package com.xqoa.taskqueue;

import com.xqoa.task.Task;

import java.util.Queue;

/**
 * @ClassName Consumer
 * @Author dell
 * @Date: 2018/5/26 14:20
 * @Description: TODD
 * @Version 1.0
 */
public class Consumer implements Runnable {

    private final Queue<Task> queue;
    Consumer(Queue<Task> q){
        queue = q;
    }

    @Override
    public void run(){
        synchronized (queue){
            // 如果缓冲区内为空，消费者释放queue对象锁，处于等待状态
            while (queue.size() <= 0){
                try{
                    queue.wait();
                }catch (InterruptedException e){
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            try{
                System.out.println("<------------任务开始----------->");
                long l1 = System.currentTimeMillis();
                Thread.sleep(1000);
                long l2 = System.currentTimeMillis();
                long time = l2 - l1;
                System.out.println("<------------任务结束：----------->");
                System.out.println("<---------任务耗时："+time+"---------->");
            }catch (InterruptedException e){
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            // 如果缓冲区不为空，消费者将队首元素取走
            queue.remove();
            System.out.println("执行了一个任务，当前任务总数为" + queue.size());
            // 取走后通知所有处于等待状态的线程
            queue.notifyAll();
        }

    }
}
