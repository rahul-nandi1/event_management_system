package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Players;

public interface PlayersRepository extends JpaRepository<Players, Integer> {

	List<Players> findByTeamName(String teamName);

	Players findByPlayerId(int playerId);

	

	

	

}
