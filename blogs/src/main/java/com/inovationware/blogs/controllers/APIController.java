package com.inovationware.blogs.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("/hello")
    public ResponseEntity<Object> hello(){
        return ResponseEntity.ok().body("welcome");
    }

}
