package com.example.Blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BlogApplication {

	public static void main(String[] args) {

		SpringApplication.run(BlogApplication.class, args);
	}
	@GetMapping
	public String welcome() {
		String message = "<h1>Welcome to my Blog!</h1>";
		String instruction = "<p>Please enter '/blog' to the URL to see my blogs.</p>";
		return message + "<br>" + instruction;
	}
}
