package com.devmind.course5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyTeacher teacher = context.getBean("teacher", MyTeacher.class);
        teacher.saySomething();

//        School firstSchool = context.getBean("school", School.class);
//        System.out.println(firstSchool.getName());
//
//        String[] myArray = {"Marius", "Marcel"};
//        int myNumber = 8;
//        String test = "test";

//        firstSchool.getAddress().setStreetName("Bd. Unirii");
//        System.out.println(firstSchool.getAddress().getStreetName());
//        System.out.println(secondSchool.getAddress().getStreetName());
//
//        com.devmind.course5.School thirdSchool = context.getBean("school", com.devmind.course5.School.class);
//        System.out.println(thirdSchool.getAddress().getStreetName());

//        System.out.println(firstSchool == secondSchool);
//        System.out.println(com.devmind.course5.School.counter);
//
//        com.devmind.course5.Teacher firstTeacher = context.getBean("teacher", com.devmind.course5.Teacher.class);
//        com.devmind.course5.Teacher secondTeacher = context.getBean("teacher", com.devmind.course5.Teacher.class);
//
//        System.out.println(firstTeacher == secondTeacher);
//
//        System.out.println(firstTeacher.getSchool().getName());
//
//        firstTeacher.updateSchool("Devmind V2");
//
//        System.out.println(firstTeacher.getSchool().getName());
//        System.out.println(secondTeacher.getSchool().getName());


        // close the context
        context.close();
    }
}
