package com.petfinder.backend.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.petfinder.backend.models.PetDto;
import com.petfinder.backend.models.Result;
import com.petfinder.backend.services.PetService;


@RestController
public class SocketController {
	

	@Autowired
	private SimpMessageSendingOperations messagingTemplate;
	@Autowired
	private PetService petService;
	
	
	@MessageMapping("/adopted")
	@ResponseBody
	public Result getPetRandom(@Payload Long petId, SimpMessageHeaderAccessor headerAccessor,
			HttpServletResponse response, HttpServletRequest request, HttpSession session) {
		PetDto pet = this.petService.getPetById(petId);
		messagingTemplate.convertAndSend("/adopted", pet);
//		PetDto frontEnd=this.petService.createObjectForFrontend(pet);
		Gson gson = new Gson();
	
		return new Result();
	}
}
