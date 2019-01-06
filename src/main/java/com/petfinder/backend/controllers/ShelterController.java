package com.petfinder.backend.controllers;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.petfinder.backend.models.Result;

@RestController
public class ShelterController {
	@RequestMapping(value = "/breed.list", method = RequestMethod.GET)
	public Result openWbForAdmin(HttpSession session,@RequestParam(required=false,defaultValue="xml") String key ) {
		JSONObject obj = new JSONObject();
		System.out.println(key);
	      obj.put("name", "foo");
	      obj.put("num", new Integer(100));
	      obj.put("balance", new Double(1000.21));
	      obj.put("is_vip", new Boolean(true));
		return new Result(obj);

	}
}
