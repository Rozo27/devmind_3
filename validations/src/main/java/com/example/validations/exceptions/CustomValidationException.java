package com.example.validations.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomValidationException extends RuntimeException{
    private String field;
    public CustomValidationException(String field, String errorMessage) {
        super(errorMessage);
        this.field = field;
    }
}
