package com.nenman.emailapp.data.repository;

import com.nenman.emailapp.data.model.MailBox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailBoxRepository extends JpaRepository<MailBox,Long> {
}
