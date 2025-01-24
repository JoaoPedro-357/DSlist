package com.dificult.temp.controllers;

import com.dificult.temp.dto.GameListDTo;
import com.dificult.temp.dto.GameMinDTO;
import com.dificult.temp.services.GameService;
import com.dificult.temp.services.GamelistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GamelistService gamelistService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTo> findAll(){
        List<GameListDTo> result = gamelistService.findAll();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }
}
