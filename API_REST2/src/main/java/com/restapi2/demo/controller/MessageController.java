package com.restapi2.demo.controller;

import com.restapi2.demo.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
public class MessageController {

    @PostMapping(value = "/messages", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getMessages(@RequestBody Message message, HttpServletRequest request) {
        if(request.getHeader("authentication") != null && request.getHeader("authentication").equals("devmind-api-key"))
            return new ResponseEntity(HttpStatus.CREATED);
        return new ResponseEntity(HttpStatus.UNAUTHORIZED);
    }
}
