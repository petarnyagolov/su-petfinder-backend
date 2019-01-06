package com.petfinder.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petfinder.backend.entities.Shelter;
import com.petfinder.backend.repositories.ShelterRepository;

@Service
public class ShelterServiceImpl implements ShelterService {
	@Autowired
	private ShelterRepository shelterRepository;

	@Override
	public List<Shelter> getAllSheltersByLocation(String location) {
		List<Shelter> shelters =this.shelterRepository.getAllSheltersByLocation(location);
		return shelters;
	}

	@Override
	public Shelter getSheltersById(Long id) {
		Shelter shelter=this.shelterRepository.getShelterById(id);
		return shelter;
	}

	@Override
	public List<Shelter> getSheltersByBreed(String breed,String animal) {
		List<Shelter> shelters=this.shelterRepository.getSheltersByBreed(breed,animal);
		return shelters;
	}

}
