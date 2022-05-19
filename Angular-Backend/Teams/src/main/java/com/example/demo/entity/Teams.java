package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Teams {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamId;
	private String teamName;
	private int teamBudget_in_$;
	
	public Teams() {
		super();
	}

	public Teams(int teamId, String teamName, int teamBudget_in_$) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamBudget_in_$ = teamBudget_in_$;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTeamBudget_in_$() {
		return teamBudget_in_$;
	}

	public void setTeamBudget_in_$(int teamBudget_in_$) {
		this.teamBudget_in_$ = teamBudget_in_$;
	}
	
	
	

}
