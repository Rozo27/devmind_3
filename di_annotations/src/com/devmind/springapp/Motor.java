package com.devmind.springapp;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Motor {
    private Integer putere;
    private String nume;
    private Integer numarCilindri;

}
