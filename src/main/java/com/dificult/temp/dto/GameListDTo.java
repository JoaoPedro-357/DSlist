package com.dificult.temp.dto;

import com.dificult.temp.entities.GameList;

public class GameListDTo {
    private Long id;
    private String name;

    public GameListDTo() {
    }
    public GameListDTo(GameList entity) {
        id = entity.getId();
        name = entity.getName() ;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
