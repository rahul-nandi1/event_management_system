package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Teams;
import com.example.demo.model.Players;
import com.example.demo.repository.TeamsRepository;

@Service
public class TeamsService {
	
		
		@Autowired
		private TeamsRepository repository;
		
		@Autowired
		private RestTemplate restTemplate;
			
		//Create team,team already exist
		public ResponseEntity<?> checkValidTeam(Teams teamData){
			
			if(repository.findByTeamName(teamData.getTeamName()) !=null) {
				
				return (ResponseEntity<?>) ResponseEntity.internalServerError();
			}
			
			repository.save(teamData);
			return ResponseEntity.ok(teamData);
		}
		
		//find player details by team name.
		public Players[] findPlayerByTeamName(String teamName) {
			
			ResponseEntity<Players[]> response=
					restTemplate.getForEntity("http://PLAYERS-SERVICE/players/findPlayersByTeamName/" +teamName,Players[].class);
			
			Players[] p=response.getBody();
			return p;
		}
		
		//find team details by giving team name
		public Teams findTeamDetails(String teamName)
		{
			return repository.findByTeamName(teamName);
		}
		


}
