package com.gbsousa.ColectionsProject.services;

import com.gbsousa.ColectionsProject.dto.GameMinDTO;

import com.gbsousa.ColectionsProject.entities.Game;
import com.gbsousa.ColectionsProject.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x->new GameMinDTO(x)).toList();
    }
}
