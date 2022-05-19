package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teams;
import com.example.demo.model.Players;
import com.example.demo.service.TeamsService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/teams")
public class TeamsController {
	
	@Autowired
	private TeamsService teamService;
	
	@PostMapping("/saveTeam")
	public ResponseEntity<?> saveTeam(@RequestBody Teams teamdata){
		
		return teamService.checkValidTeam(teamdata);
	}
	
	@GetMapping("/{teamName}")
	public Players[] findPlayerByTeamName(@PathVariable("teamName") String teamName) {
		
		return teamService.findPlayerByTeamName(teamName);
		
	}
	
	@GetMapping("/findTeamDetails/{teamName}")
	public Teams findTeamDetails(@PathVariable("teamName") String teamName) {
		return teamService.findTeamDetails(teamName);
	}
	

}
