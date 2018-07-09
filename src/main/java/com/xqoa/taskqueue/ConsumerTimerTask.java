package com.xqoa.taskqueue;

import com.xqoa.task.Task;

import java.util.Queue;
import java.util.TimerTask;

/**
 * @ClassName ConsumerTimerTask
 * @Author dell
 * @Date: 2018/5/26 14:24
 * @Description: TODD
 * @Version 1.0
 */
public class ConsumerTimerTask extends TimerTask {
    private final Queue<Task> queue;
    public ConsumerTimerTask(Queue<Task> q){
        queue = q;
    }

    @Override
    public void run(){
        Consumer c = new Consumer(queue);
        new Thread(c).start();
    }
}
