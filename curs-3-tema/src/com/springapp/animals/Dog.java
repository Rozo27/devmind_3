package com.springapp.animals;

public class Dog implements IAnimal{
    @Override
    public String makeSound() {
        return "dog sound";
    }
}
