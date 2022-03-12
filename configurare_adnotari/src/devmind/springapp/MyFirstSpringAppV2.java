package devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAppV2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Trying to initialize teacher");
        JavaTeacher myTeacher = context.getBean("myTeacher", JavaTeacher.class);
        System.out.println(myTeacher.getHomework());
        System.out.println(myTeacher.getWisdom());
        myTeacher.setAge(30);
        System.out.println("AGE " + myTeacher.getAge());

        ITeacher mathTeacher = context.getBean("mathTeacher", MathTeacher.class);
        System.out.println(mathTeacher.getWisdom());
    }
}
