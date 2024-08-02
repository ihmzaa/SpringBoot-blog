package com.example.Blog.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegistrationDto {
   @NotBlank
   private String username;
   @NotBlank
   private String password;
   @NotBlank
   private String email;
}
