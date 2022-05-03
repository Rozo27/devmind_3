package com.example.validations.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomRequestException extends RuntimeException{
    private String field;
    public CustomRequestException(String field, String errorMessage) {
        super(errorMessage);
        this.field = field;
    }
}
