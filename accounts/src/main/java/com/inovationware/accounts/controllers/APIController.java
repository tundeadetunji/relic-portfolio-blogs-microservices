package com.inovationware.accounts.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("/hi")
    public ResponseEntity<Object> hi(){
        return ResponseEntity.ok().body("hi");
    }
}
