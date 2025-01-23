package com.dificult.temp.repositories;

import com.dificult.temp.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

