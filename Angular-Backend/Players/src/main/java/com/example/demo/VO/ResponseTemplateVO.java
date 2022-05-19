package com.example.demo.VO;

import com.example.demo.entity.Players;

public class ResponseTemplateVO {
	
	private Players players;
	
	private Teams teams;

	public ResponseTemplateVO() {
		super();
	}

	public ResponseTemplateVO(Players players, Teams teams) {
		super();
		this.players = players;
		this.teams = teams;
	}

	public Players getPlayers() {
		return players;
	}

	public void setPlayers(Players players) {
		this.players = players;
	}

	public Teams getTeams() {
		return teams;
	}

	public void setTeams(Teams teams) {
		this.teams = teams;
	}
	
	

}
