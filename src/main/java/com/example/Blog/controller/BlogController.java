package com.example.Blog.controller;

import com.example.Blog.model.Blog;
import com.example.Blog.model.User;
import com.example.Blog.repository.BlogRepository;
import com.example.Blog.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blog")
public class BlogController {

    private final BlogRepository repository;


    @Autowired
    public BlogController(BlogRepository repository ) {
        this.repository = repository;

    }

    @GetMapping
    public List<Blog> getAllBlogs() {
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Blog> getblog(@PathVariable Long id){
        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteBlogById(@PathVariable Long id) {
        repository.deleteById(id);
        return "The blog with the id: " + id + " has been deleted!";
    }

    @PostMapping("/add")
    public Blog createBlog(@Valid @RequestBody Blog blog) {
        return repository.save(blog);
    }

    @PostMapping("/addlist")
    public List<Blog> createBlogs(@Valid @RequestBody List<Blog> blogs) {
        return repository.saveAll(blogs);
    }

    @PutMapping("/{id}")
    public Blog updateBlog(@PathVariable Long id, @Valid @RequestBody Blog updatedBlog) {
        return repository.findById(id)
                .map(blog -> {
                    blog.setTitle(updatedBlog.getTitle());
                    blog.setContent(updatedBlog.getContent());
                    return repository.save(blog);
                })
                .orElseThrow(() -> new RuntimeException("Blog with id " + id + " not found"));
    }
}
