package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Players {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int playerId;
	private String playerName;
	private int playerBudget_in_$;
	private String teamName;
	
	public Players() {
		super();
	}

	public Players(int playerId, String playerName, int playerBudget_in_$, String teamName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerBudget_in_$ = playerBudget_in_$;
		this.teamName = teamName;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerBudget_in_$() {
		return playerBudget_in_$;
	}

	public void setPlayerBudget_in_$(int playerBudget_in_$) {
		this.playerBudget_in_$ = playerBudget_in_$;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	

	
	

	
}
