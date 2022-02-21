package com.springapp.animals;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext myContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        conflict->NoUniqueBeanDefinitionException
//        IAnimal animal = myContext.getBean(IAnimal.class);
//        System.out.println(animal.makeSound());

        IAnimal animal = myContext.getBean("myCat", IAnimal.class);
        System.out.println(animal.makeSound());
    }
}
