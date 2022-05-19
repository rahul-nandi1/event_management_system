package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Registration;
import com.example.demo.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository repository;
	
	public Registration saveUser( Registration registration) {
	   return repository.save(registration);	
	}
	
	public ResponseEntity<?> checkValidUser( Registration registrationData ){
		
		Registration registration = repository.findByUserName(registrationData.getUserName());
		if(registration.getPassword().equals(registration.getPassword()))
		{
			return ResponseEntity.ok(registration);
		}
	
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	
	}
	
}
