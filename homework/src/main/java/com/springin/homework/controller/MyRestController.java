package com.springin.homework.controller;

import com.github.javafaker.Faker;
import com.springin.homework.model.MathRequest;
import com.springin.homework.model.ResultResponse;
import com.springin.homework.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@RestController
public class MyRestController {
    @Autowired
    private MathService mathService;

    @GetMapping("/time")
    @ResponseBody
    public String getCurrentHour(@RequestParam String timeZone){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
        return sdf.format(new Date());
    }

    @GetMapping("/harry-potter")
    @ResponseBody
    public String getHarryPotterName(){
        Faker faker = new Faker();
        return faker.resolve("harry_potter.characters");
    }

    @PostMapping("/math-service")
    @ResponseBody
    public ResultResponse calculate(@RequestBody MathRequest mathRequest){
        return this.mathService.getResult(mathRequest);
    }
}
