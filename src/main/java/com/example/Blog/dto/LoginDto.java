package com.example.Blog.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginDto {
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
}
