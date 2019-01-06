package com.petfinder.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petfinder.backend.entities.Breed;
import com.petfinder.backend.repositories.BreedRepository;

@Service
public class BreedServiceImpl implements BreedService {
	@Autowired
	private BreedRepository breedRepository;

	@Override
	public List<Breed> findAllBreeds(String animal) {
		List<Breed> breeds = this.breedRepository.findAllBreedsByAnimal(animal);
		return breeds;
	}

}
