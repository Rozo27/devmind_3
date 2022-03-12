package com.devmind.springapp;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
public class Autocar implements Automobil{
    @Override
    public boolean travel() {
        return true;
    }

    @Override
    public Integer maxDrivingSpeed() {
        return 75;
    }
    @Override
    public String toString() {
        return "Autocar{\n\ttravel:"+ this.travel()+"\n\t"+this.maxDrivingSpeed()+"}";
    }
}
