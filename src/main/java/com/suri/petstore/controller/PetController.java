package com.suri.petstore.controller;

import com.suri.petstore.dto.Pet;
import com.suri.petstore.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping(value = "/pets")
    public List<Pet> findAllPets() {
        return petService.findAllPets();
    }

    @GetMapping(value = "/pet/{id}")
    public Pet findPet(@PathVariable("id") Long id) {
        return petService.findPet(id);
    }

    @PostMapping(value = "/pet")
    @ResponseStatus(HttpStatus.CREATED)
    public Pet createPet(@RequestBody Pet pet) {
        return petService.savePet(pet);
    }

    @PutMapping(value ="/pet")
    public Pet updatePet(@RequestBody Pet pet) {
        return petService.savePet(pet);
    }

    @DeleteMapping(value = "/pet/{id}")
    public void removePet(@PathVariable("id") Long id) {
        petService.removePet(id);
    }
}
