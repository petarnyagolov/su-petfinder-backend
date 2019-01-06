package com.petfinder.backend.services;

import java.util.List;

import com.petfinder.backend.entities.Pet;
import com.petfinder.backend.entities.Shelter;
import com.petfinder.backend.models.PetBindingModel;
import com.petfinder.backend.models.PetDto;

public interface PetService {

	PetDto getPetById(Long id);

	List<PetDto> getAllPets();

	PetDto createPet(PetBindingModel petBindingModel);

	List<PetDto> getAllPetsByShelterId(Long id);

	PetDto getOneRandomPet();



}
