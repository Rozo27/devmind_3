package com.devmind.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.devmind.springapp")
public class Config {
    @Bean
    @Scope("prototype")
    public Task myTask() {
        return new Task();
    }

    @Bean
    @Scope
    public Task mySingletonTask() {
        return new Task();
    }
}
