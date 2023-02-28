package com.nenman.emailapp.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MailBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Message> inbox;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Message> outbox;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Message> trash;
    @OneToOne
    private User user;

}
