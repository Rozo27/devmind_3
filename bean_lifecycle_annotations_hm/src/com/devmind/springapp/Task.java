package com.devmind.springapp;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Data
public class Task {
    private String taskName;
    private Integer taskId;
    private Integer executionTime;

    public static Integer numberOfTasks = 0;

    @PostConstruct
    private void init(){
        numberOfTasks++;
        this.taskId = generateId();
        this.taskName = "Task no." + this.taskId;
        this.executionTime = new Random().nextInt(20);
        System.out.println("S-a creat task-ul:"+this.toString());
    }
    public void run() throws InterruptedException {
        Thread.sleep(this.executionTime * 100);
    }
    public Integer generateId(){
        return numberOfTasks;
    }

    @PreDestroy
    private void destroy(){
        numberOfTasks--;
        System.out.println("S-a distrus task-ul:"+this.toString());
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskId=" + taskId +
                ", executionTime=" + executionTime +
                '}';
    }


}
