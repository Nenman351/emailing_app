package com.nenman.emailapp.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    private String phoneNumber;
    private List<Contact> contacts = new ArrayList<>();
    private MailBox mailBox;
}
