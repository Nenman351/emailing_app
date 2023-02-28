package com.nenman.emailapp.data.repository;

import com.nenman.emailapp.data.model.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<UserContact,Long> {
}
