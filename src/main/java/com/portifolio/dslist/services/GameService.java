package com.portifolio.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portifolio.dslist.dto.GameMinDTO;  
import com.portifolio.dslist.entities.Game;
import com.portifolio.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository; 
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
//	OU TMB:		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	
	}
}
