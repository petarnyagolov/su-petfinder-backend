package com.petfinder.backend.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.petfinder.backend.entities.Shelter;

@Mapper
public interface ShelterRepository {

	List<Shelter> getAllSheltersByLocation(@Param("location")String location);

	Shelter getShelterById(@Param("id")Long id);

	List<Shelter> getSheltersByBreed(@Param("breed")String breed,@Param("animal")String animal);

}
