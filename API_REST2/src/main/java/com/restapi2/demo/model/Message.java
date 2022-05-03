package com.restapi2.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Message {
    private String sender;
    private String receiver;
    private String text;
    private Boolean seen;
    @JsonProperty("sentDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss:SS", timezone = "GMT")
    private LocalDateTime dateTime;
}

