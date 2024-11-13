package com.gbsousa.ColectionsProject.repositories;

import com.gbsousa.ColectionsProject.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
