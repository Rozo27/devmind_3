package com.devmind.springapp;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
public class ExcursieV2 {
    @Autowired
    private Automobil masina;

    @Autowired
    @Qualifier("autocar")
    private Automobil myAutocar;
}
