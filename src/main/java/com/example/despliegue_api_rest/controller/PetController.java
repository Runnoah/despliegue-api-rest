package com.example.despliegue_api_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.despliegue_api_rest.entity.Pet;
import com.example.despliegue_api_rest.repository.PetRepository;

import java.util.List;
@RestController
public class PetController {
    
    private PetRepository petRepository;

    public PetController (PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @GetMapping
    public List<Pet> hello() {


        return petRepository.findAll();
    }

}
