package com.nenman.emailapp.data.repository;

import com.nenman.emailapp.data.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
