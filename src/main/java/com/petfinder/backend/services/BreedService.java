package com.petfinder.backend.services;

import java.util.List;

import com.petfinder.backend.entities.Breed;

public interface BreedService {

	List<Breed> findAllBreeds(String animal);

}
