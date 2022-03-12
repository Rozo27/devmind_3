package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyStartClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Excursie excursie = context.getBean("excursie", Excursie.class);
        excursie.getMasina().setMotor(new Motor(200, "AMG", 4));
        System.out.println(excursie.toString());

        System.out.println("\n******************");
        ExcursieV2 excursieV2 = context.getBean("excursieV2", ExcursieV2.class);
        System.out.println(excursieV2.toString());
    }
}
