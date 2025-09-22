package com.example.despliegue_api_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
    
    @GetMapping
    public String helloworld() {
        return "Hello World";
    }
}
