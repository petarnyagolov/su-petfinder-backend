package com.petfinder.backend.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.petfinder.backend.entities.Pet;
import com.petfinder.backend.models.PetBindingModel;
import com.petfinder.backend.models.PetDto;
import com.petfinder.backend.models.Result;
import com.petfinder.backend.services.PetService;

@RestController
public class PetController {
	
	@Autowired
	private PetService petService;

	@RequestMapping(value = "/pet.get", method = RequestMethod.GET)
	public Result getPetById(HttpSession session, @RequestParam(required = true) String key,
			@RequestParam(required = true) Long id) {
		PetDto pet = this.petService.getPetById(id);
		Gson gson = new Gson();
		String json = gson.toJson(pet); // convert
		System.out.println(json);
		return new Result(pet);
	}
	
	
	@RequestMapping(value = "/pet.getRandom", method = RequestMethod.GET)
	public Result getPetRandom(HttpSession session, @RequestParam(required = true) String key) {
		PetDto pet = this.petService.getOneRandomPet();
//		PetDto frontEnd=this.petService.createObjectForFrontend(pet);
		Gson gson = new Gson();
		String json = gson.toJson(pet); // convert
		System.out.println(json);
		return new Result(pet);
	}
	
	@RequestMapping(value = "/pet.find", method = RequestMethod.GET)
	public Result findPet(HttpSession session, @RequestParam(required = true) String key) {
		List<PetDto> pets = this.petService.getAllPets();
//		PetDto frontEnd=this.petService.createObjectForFrontend(pet);
		Gson gson = new Gson();
		String json = gson.toJson(pets); // convert
		System.out.println(json);
		return new Result(pets);
	}
	
	@RequestMapping(value = "/pet.create", method = RequestMethod.POST)
	public Result createPet(@RequestBody PetBindingModel petBindingModel, HttpSession session, @RequestParam(required = true) String key	) {
		PetDto pet = this.petService.createPet(petBindingModel);
		Gson gson = new Gson();
		String json = gson.toJson(pet); // convert
		System.out.println(json);
		return new Result(pet);
	}
	

}
