package com.devmind.springapp;

import com.devmind.springapp.homework.IHomework;
import com.devmind.springapp.teachers.ITeacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ITeacher teacher = context.getBean("myTeacher", ITeacher.class);
        System.out.println(teacher.getHomework());

        IHomework homework = context.getBean("historyHomework", IHomework.class);
        System.out.println(homework.getGrade());
    }
}
