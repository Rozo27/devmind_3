package com.example.validations.controller;

import com.example.validations.exceptions.CustomRequestException;
import com.example.validations.model.LoginRequest;
import com.example.validations.model.LoginResponse;
import com.example.validations.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {

    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<User> loggedUsers = new ArrayList<>();

    @PostMapping("/register")
    public User handleRegister(@Valid @RequestBody User user) {
        users.stream().forEach(u->{
            if(u.getEmail().equals(user.getEmail()))
                throw new CustomRequestException("email", "There is already one user with this mail");
        });
        users.add(user);
        users.stream().forEach(u-> System.out.println(u));
        return user;
    }

    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<LoginResponse> handleLogin(@Valid @RequestBody LoginRequest loginRequest) {
        Optional<User> user = users.stream().filter(u -> u.getEmail().equals(loginRequest.getEmail())).findFirst();
        if(user.isEmpty())
            throw new CustomRequestException("email+password","This user does not exist");

        User u = user.get();
        LoginResponse loginResponse = new LoginResponse(u.getFirstName(), u.getLastName(),u.getEmail());

        Optional<User> loggedUser = loggedUsers.stream().filter(us -> us.getEmail().equals(loginRequest.getEmail())).findFirst();
        if(loggedUser.isEmpty()) {
            loggedUsers.add(u);
            loggedUsers.stream().forEach(us-> System.out.println(us));
            return new ResponseEntity<>(loginResponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(loginResponse, HttpStatus.ACCEPTED);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(CustomRequestException.class)
    public Map<String, String> handleValidationExceptions(CustomRequestException ex) {
        Map<String, String> errors = new HashMap<>();
        errors.put("field", ex.getField());
        errors.put("error_message", ex.getMessage());
        return errors;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return errors;
    }
}