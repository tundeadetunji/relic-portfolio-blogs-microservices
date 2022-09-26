package com.inovationware.blogs.web.controllers;

import com.inovationware.blogs.business.models.Blog;
import com.inovationware.blogs.business.services.BlogService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class APIController {

    private final BlogService service;

    @GetMapping("/blogs")
    public ResponseEntity<List<Blog>> getBlogs(){
        return ResponseEntity.ok().body(service.Blogs());
    }

    @GetMapping("/blogs/{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable Long id){
        return ResponseEntity.ok().body(service.getBlog(id));
    }

    @PostMapping("/blogs/new")
    public ResponseEntity<Blog> addBlog(@RequestBody Blog blog){
        service.addBlog(blog);
        return ResponseEntity.ok().body(blog);
    }

}
