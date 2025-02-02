package com.dificult.temp.controllers;

import com.dificult.temp.dto.GameDTO;
import com.dificult.temp.dto.GameMinDTO;
import com.dificult.temp.entities.Game;
import com.dificult.temp.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value ="/{id}")
    public GameDTO finById(@PathVariable Long id) {
      GameDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
