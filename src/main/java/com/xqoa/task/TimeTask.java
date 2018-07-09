package com.xqoa.task;

import com.xqoa.taskqueue.ConsumerTimerTask;
import com.xqoa.taskqueue.ProducerTimerTask;
import org.springframework.stereotype.Component;

import java.util.Queue;
import java.util.TimerTask;

/**
 * @ClassName TimeTask
 * @Author dell
 * @Date: 2018/5/26 10:28
 * @Description: TODD
 * @Version 1.0
 */
@Component
public class TimeTask implements Runnable{

    private Queue<Task> queue;

    public TimeTask() {
    }

    public TimeTask(Queue<Task> qTask){
        queue = qTask;
    }

    @Override
    public void run() {
        //System.out.println( new Date().toString() + "定时任务启动");
        ProducerTimerTask producerTimerTask = new ProducerTimerTask(queue);
        producerTimerTask.run();
        ConsumerTimerTask consumerTimerTask = new ConsumerTimerTask(queue);
        consumerTimerTask.run();
    }
}
