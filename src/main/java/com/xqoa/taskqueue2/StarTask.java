package com.xqoa.taskqueue2;

import com.xqoa.task.Task;
import com.xqoa.task.TimeTask;
import com.xqoa.taskqueue.ConsumerTimerTask;
import com.xqoa.taskqueue.ProducerTimerTask;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName StarTask
 * @Author dell
 * @Date: 2018/5/26 14:30
 * @Description: TODD
 * @Version 1.0
 */
@Component
public class StarTask {

    private final  Queue<Task> taskQueue = new LinkedList<Task>();


}
