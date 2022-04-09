package com.devmind.mvn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyTeacher teacher = context.getBean("teacher", MyTeacher.class);
        teacher.saySomething();

        context.close();
    }
}
