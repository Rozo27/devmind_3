package com.devmind.springapp;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Component
public class Excursie {
    @Autowired
    private Masina masina;
    private Autocar auto;
    private Motocicleta moto;

    @Autowired
    public void setAutocar(Autocar autocar){
        this.auto = autocar;
    }

    @Autowired
    public Excursie(Motocicleta moto){
        this.moto = moto;
    }
}
