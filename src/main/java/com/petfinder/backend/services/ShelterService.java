package com.petfinder.backend.services;

import java.util.List;

import com.petfinder.backend.entities.Shelter;

public interface ShelterService {

	List<Shelter> getAllSheltersByLocation(String location);

	Shelter getSheltersById(Long id);

	List<Shelter> getSheltersByBreed(String breed, String animal);

}
