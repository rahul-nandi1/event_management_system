package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Players;
import com.example.demo.service.PlayersService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/players")
public class PlayersController {
	
	@Autowired
	private PlayersService service;
	
	@PostMapping("/savePlayer")
	public ResponseEntity<?> savePlayer(@RequestBody Players players){
		
		return service.savePlayer(players);
	}
	

	@GetMapping("/findPlayersByTeamName/{teamName}")
	public List<Players> findPlayersByTeamName(@PathVariable("teamName") String teamName)
	{
		return service.findPlayersByTeamName(teamName);
		
	}	
	
	@GetMapping("/findByPlayerId/{playerId}")
	public ResponseEntity<?> findByPlayerId(@PathVariable("playerId") int playerId){
		
		return service.findByPlayerId(playerId);
	}
}
