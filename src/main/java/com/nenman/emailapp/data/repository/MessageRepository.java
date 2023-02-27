package com.nenman.emailapp.data.repository;

import com.nenman.emailapp.data.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
