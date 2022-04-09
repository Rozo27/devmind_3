package com.springin.homework.model;

import lombok.Data;

@Data
public class MathRequest {
    private Integer firstNumber;
    private Integer secondNumber;
    private String operation;
}
