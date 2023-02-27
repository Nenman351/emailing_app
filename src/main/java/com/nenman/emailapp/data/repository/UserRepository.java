package com.nenman.emailapp.data.repository;

import com.nenman.emailapp.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
