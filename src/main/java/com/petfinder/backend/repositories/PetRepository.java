package com.petfinder.backend.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.petfinder.backend.entities.Pet;
import com.petfinder.backend.models.PetDto;

@Mapper
public interface PetRepository {

	PetDto findPetById(@Param("id")Long id);

	List<PetDto> findAllPets();

}
