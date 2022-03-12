package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Task task1 = context.getBean("myTask", Task.class);

        Task task2 = context.getBean("myTask", Task.class);

        Task task3 = context.getBean("mySingletonTask", Task.class);

        task2.run();
        System.out.println("Id-ul task-ului " + task3.getTaskName() +" este:" + task3.getTaskId());
        task3.setTaskName("Task_LOMBOK");
        System.out.println("Id-ul task-ului " + task3.getTaskName() +" este:" + task3.getTaskId());

        context.close();
    }
}
