package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Teams;

public interface TeamsRepository extends JpaRepository<Teams, Integer> {



	Teams findByTeamName(String teamName);

}
