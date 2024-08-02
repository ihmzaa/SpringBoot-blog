package com.example.Blog.service;

import com.example.Blog.dto.RegistrationDto;
import com.example.Blog.model.User;

public interface UserService {
    void save(RegistrationDto registrationDto);

    User findByEmail(String email);

    User findByUsername(String username);
}
