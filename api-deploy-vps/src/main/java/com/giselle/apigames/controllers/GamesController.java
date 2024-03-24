package com.giselle.apigames.controllers;

import com.giselle.apigames.domain.Game;
import com.giselle.apigames.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GamesController {
    private final GameService gameService;

    public GamesController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("")
    public ResponseEntity<List<Game>> getGames() {
       List<Game> listGames = this.gameService.getGamesFromAwsStorage();
        return ResponseEntity.ok().body(listGames);
    }
}
