package com.petfinder.backend.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.petfinder.backend.entities.Shelter;
import com.petfinder.backend.models.PetDto;
import com.petfinder.backend.models.Result;
import com.petfinder.backend.services.PetService;
import com.petfinder.backend.services.ShelterService;

@RestController
public class ShelterController {
	@Autowired
	private ShelterService shelterService;
	@Autowired
	private PetService petService;

	@RequestMapping(value = "/shelter.find", method = RequestMethod.GET)
	public Result openWbForAdmin(HttpSession session, @RequestParam(required = true) String key,
			@RequestParam(required = true) String location) {
		List<Shelter> shelters = this.shelterService.getAllSheltersByLocation(location);
		return new Result(shelters);

	}
	
	
	@RequestMapping(value = "/shelter.get", method = RequestMethod.GET)
	public Result openWbForAdmin(HttpSession session, @RequestParam(required = true) String key,
			@RequestParam(required = true) Long id) {
		Shelter shelter = this.shelterService.getSheltersById(id);
		return new Result(shelter);

	}
	
	@RequestMapping(value = "/shelter.getPets", method = RequestMethod.GET)
	public Result getPetById(HttpSession session, @RequestParam(required = true) String key,
			@RequestParam(required = true) Long id) {
		List<PetDto> pets = this.petService.getAllPetsByShelterId(id);
//		Gson gson = new Gson();
//		String json = gson.toJson(pet); // convert
//		System.out.println(json);
		return new Result(pets);
	}
	
	@RequestMapping(value = "/shelter.listByBreed", method = RequestMethod.GET)
	public Result getPetById(HttpSession session, @RequestParam(required = true) String key,@RequestParam(required=true)String animal,
			@RequestParam(required = true) String breed) {
		List<Shelter> shelters = this.shelterService.getSheltersByBreed(breed,animal);
//		Gson gson = new Gson();
//		String json = gson.toJson(pet); // convert
//		System.out.println(json);
		return new Result(shelters);
	}
}
