package com.devmind.springapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MathService {
    private Integer number = 10;

    public Integer divideNumberBy(Integer dividend) {
        return number / dividend;
    }

}
