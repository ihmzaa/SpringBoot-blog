package com.example.Blog.repository;

import com.example.Blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
 Optional<User> findByEmail(String email);
 Optional<User> findByUsername(String username);
 Boolean existsByUsername(String username);
}
