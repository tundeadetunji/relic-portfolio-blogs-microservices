package com.inovationware.blogs.business.services;

import com.inovationware.blogs.business.models.Blog;
import com.inovationware.blogs.business.repositories.BlogRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlogService {

    private final BlogRepository repository;

    public void addBlog(Blog blog){
        repository.save(blog);
    }

    public List<Blog> Blogs (){
        return repository.findAll();
    }

    public Blog getBlog(Long id){
        return repository.findById(id).get();
    }
}
