package com.petfinder.backend.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.petfinder.backend.entities.Breed;

@Mapper
public interface BreedRepository {

	List<Breed> findAllBreedsByAnimal(@Param("animal")String animal);

}
