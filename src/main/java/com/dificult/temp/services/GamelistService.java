package com.dificult.temp.services;

import com.dificult.temp.dto.GameListDTo;
import com.dificult.temp.entities.GameList;
import com.dificult.temp.repositories.GameListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GamelistService {

    @Autowired
    private GameListRepository gameListRepository;




    @Transactional(readOnly = true)
    public List<GameListDTo> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTo(x)).toList();

    }
}
