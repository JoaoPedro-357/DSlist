package com.dificult.temp.services;

import com.dificult.temp.dto.GameMinDTO;
import com.dificult.temp.entities.Game;
import com.dificult.temp.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
