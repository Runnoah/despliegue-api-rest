package com.example.despliegue_api_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.despliegue_api_rest.entity.Pet;
import com.example.despliegue_api_rest.repository.PetRepository;

import java.util.List;
@RestController
@RequestMapping("/pet")
/**
 * El controlador es donde tenemos expuesto todos los endpoints de la entidad Pet.
 * The controller is where we have all the endpoints of the Pet entity exposed.
 * {@link Pet}
 * @version 1.0 
 * @author MiNombre
 */
public class PetController {
    
    private PetRepository petRepository;

    /**
     * Constructor del controlador.
     * Constructor of the controller.
     * @param petRepository repositorio para consultar en BD
     * @param petRepository repository to query in DB
     */
    public PetController (PetRepository petRepository) {
        this.petRepository = petRepository;
    }
    
    /**
     * Este metodo devuelve la lista de mascotas.
     * This method returns the list of pets.
     * @return List<Pet> información de cada mascota
     * @return List<Pet> information of each pet
     */
    @GetMapping("/list")
    public List<Pet> hello() {
        return petRepository.findAll();
    }

}
