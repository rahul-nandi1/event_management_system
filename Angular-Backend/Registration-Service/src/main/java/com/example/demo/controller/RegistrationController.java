package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Registration;
import com.example.demo.service.RegistrationService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/saveUser")
	public Registration saveUser(@RequestBody Registration registration) {
		return service.saveUser(registration);
	}
	
	@PostMapping("/checkValidity")
	public ResponseEntity<?> chechkValidUser(@RequestBody Registration registrationData){
		
		return service.checkValidUser(registrationData);
	}

}
