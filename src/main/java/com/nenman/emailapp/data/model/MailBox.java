package com.nenman.emailapp.data.model;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MailBox {
    @Id
    private Long id;
    private List<Message> inbox;
    private List<Message> outbox;
    private List<Message> trash;

}
