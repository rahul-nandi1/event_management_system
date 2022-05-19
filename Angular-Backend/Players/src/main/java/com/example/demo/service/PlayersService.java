package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.VO.Teams;
import com.example.demo.entity.Players;
import com.example.demo.repository.PlayersRepository;

@Service
public class PlayersService {

		
		@Autowired
		private PlayersRepository repository;
		
		@Autowired
		private RestTemplate template;
		
		
		
		//show all the player details by team name
	 	public List<Players> findPlayersByTeamName(String teamName){
	 		
	 		return repository.findByTeamName(teamName);
	 	}
	 
	 	
	 	//player details by playerId
	 	public ResponseEntity<?> findByPlayerId(int playerId){
	 		
	 		if(repository.findByPlayerId(playerId)==null) {
	 			
	 			return (ResponseEntity<?>) ResponseEntity.internalServerError(); 	
	 			}
	 	
	 	
	 	return ResponseEntity.ok(repository.findByPlayerId(playerId));
	}
	 	
	 	//create player
	 	public ResponseEntity<?> savePlayer(Players players){
	 		
	 		Teams teamResponse= template.getForObject("http://TEAMS-SERVICE/teams/findTeamDetails/"+ players.getTeamName(),Teams.class);
	 		
	 		int sum=0;
	 		List<Players> p=repository.findByTeamName(teamResponse.getTeamName());
	 		for(Players p1:p)
	 		{
	 			sum=sum+p1.getPlayerBudget_in_$();
	 			
	 		}
	 		if(sum<=teamResponse.getTeamBudget_in_$())
	 		{
	 			sum=sum+players.getPlayerBudget_in_$();
	 			
	 		}
	 		if(sum<=teamResponse.getTeamBudget_in_$())
	 		{
	 			
	 			repository.save(players);
	 			return ResponseEntity.ok(players);
	 		}
	 		else {
	 			
	 			players.setTeamName("NA");
	 			repository.save(players);
	 			return (ResponseEntity<?>)ResponseEntity.internalServerError();
	 		}
	 	}

}
