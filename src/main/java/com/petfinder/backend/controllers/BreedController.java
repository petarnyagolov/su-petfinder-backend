package com.petfinder.backend.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.petfinder.backend.entities.Breed;
import com.petfinder.backend.models.Result;
import com.petfinder.backend.services.BreedService;

@RestController
public class BreedController {
	@Autowired
	private BreedService breedService;

	@RequestMapping(value = "/breed.list", method = RequestMethod.GET)
	public Result findAllBreeds(HttpSession session,@RequestParam(required = true) String key,@RequestParam(required = true)  String animal) {
		List<Breed> breeds = this.breedService.findAllBreeds(animal);
		return new Result(breeds);

	}
}
