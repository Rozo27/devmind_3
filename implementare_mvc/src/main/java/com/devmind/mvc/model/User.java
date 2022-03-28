package com.devmind.mvc.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private String userName;
    private String email;
    private String phone;
    private Date birthday;
}
