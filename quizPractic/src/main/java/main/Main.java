package main;

import config.StudentConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import quiz.Student;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);

        Student prototype = context.getBean("studentPrototype", Student.class);
        Student prototype2 = context.getBean("studentPrototype", Student.class);
        prototype.setFirstName("Gigel");
        System.out.println(prototype.getFirstName());
        System.out.println(prototype2.getFirstName());

        Student singleton = context.getBean("student", Student.class);
        Student singleton2 = context.getBean("student", Student.class);
        singleton.setFirstName("Ion");
        singleton.setLastName("Popescu");
        singleton.setGrade(8.5);
        System.out.println(singleton.getFirstName());
        System.out.println(singleton2.getFirstName());
    }
}
