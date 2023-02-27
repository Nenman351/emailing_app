package com.nenman.emailapp.data.model;

import jakarta.persistence.Id;

public class Contact {
    @Id
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
}
