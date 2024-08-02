package com.example.Blog.service;

import com.example.Blog.model.Blog;

import java.util.List;

public interface BlogService {
    Blog createBlog(Blog blog);
    String deleteBlogById(Long id);
    List<Blog> getAllBlogs();
    Blog updateBlog(Long id, Blog blog);
}
