package com.devmind.springapp;

import org.springframework.stereotype.Component;

@Component
public class Motocicleta implements Automobil{
    @Override
    public boolean travel() {
        return false;
    }

    @Override
    public Integer maxDrivingSpeed() {
        return 100;
    }


    @Override
    public String toString() {
        return "Motocicleta{\n\ttravel:"+ this.travel()+"\n\t"+this.maxDrivingSpeed()+"}";
    }
}
