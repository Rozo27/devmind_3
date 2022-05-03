package com.example.validations.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {
    private String firstName;
    private String lastName;
    private String email;
}
