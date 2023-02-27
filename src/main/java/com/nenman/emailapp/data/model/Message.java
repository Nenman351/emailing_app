package com.nenman.emailapp.data.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Message {
    private Long id;
    private String subject;
    private String body;
    private String recipient;
    private String sender;
    private LocalDateTime created;
}
