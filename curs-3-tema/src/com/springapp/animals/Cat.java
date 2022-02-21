package com.springapp.animals;

public class Cat implements IAnimal{
    private String animalName;

    public Cat(String animalName){
        this.animalName = animalName;
    }
    @Override
    public String makeSound() {
        return this.animalName + "'s sound";
    }
}
