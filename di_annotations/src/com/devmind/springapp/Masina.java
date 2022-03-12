package com.devmind.springapp;

import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@Component
public class Masina implements Automobil{
    @Autowired
    private Motor motor;

    @Override
    public boolean travel() {
        return true;
    }

    @Override
    public Integer maxDrivingSpeed() {
        return 90;
    }

    @Override
    public String toString() {
        return "Masina{\n\ttravel:"+ this.travel()+"\n\t"+this.maxDrivingSpeed()+"}\n"+motor.toString();
    }
}
