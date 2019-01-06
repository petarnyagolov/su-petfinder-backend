package com.petfinder.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petfinder.backend.entities.Pet;
import com.petfinder.backend.entities.Shelter;
import com.petfinder.backend.models.PetBindingModel;
import com.petfinder.backend.models.PetDto;
import com.petfinder.backend.repositories.PetRepository;

@Service
public class PetServiceImpl implements PetService {
	@Autowired
	private PetRepository petRepository;

	@Override
	public PetDto getPetById(Long id) {
		PetDto pet = this.petRepository.findPetById(id);
		return pet;
	}

	@Override
	public List<PetDto> getAllPets() {
		List<PetDto> pets = this.petRepository.findAllPets();
		return pets;
	}

	@Override
	public PetDto createPet(PetBindingModel petBindingModel) {
		PetDto pet =this.petRepository.createPet(petBindingModel);
		return pet;
	}

	@Override
	public List<PetDto> getAllPetsByShelterId(Long id) {
		 List<PetDto> pets=this.petRepository.findAllPetsByShelterId(id);
		return pets;
	}

	@Override
	public PetDto getOneRandomPet() {
		PetDto petDto= this.petRepository.findOneRandomPet();
		return petDto;
	}



}
