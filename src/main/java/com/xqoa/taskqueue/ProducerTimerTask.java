package com.xqoa.taskqueue;

import com.xqoa.task.Task;

import java.util.Queue;
import java.util.TimerTask;

/**
 * @ClassName ProducerTimerTask
 * @Author dell
 * @Date: 2018/5/26 14:23
 * @Description: TODD
 * @Version 1.0
 */
public class ProducerTimerTask extends TimerTask {
    private final Queue<Task> queue;
    public ProducerTimerTask(Queue<Task> q){
        queue = q;
    }

    @Override
    public void run(){
        Producer p = new Producer(queue);
        new Thread(p).start();
    }
}
