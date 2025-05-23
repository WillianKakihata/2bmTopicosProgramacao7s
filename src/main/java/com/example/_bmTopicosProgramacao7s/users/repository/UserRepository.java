package com.example._bmTopicosProgramacao7s.users.repository;

import com.example._bmTopicosProgramacao7s.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);

}
