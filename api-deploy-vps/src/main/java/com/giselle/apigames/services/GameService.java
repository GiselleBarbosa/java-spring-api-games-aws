package com.giselle.apigames.services;

import com.giselle.apigames.domain.Game;
import com.giselle.apigames.feing.GameClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final GameClient gameClient;
    public GameService(GameClient gameClient){
        this.gameClient = gameClient;
    }
    public List<Game> getGamesFromAwsStorage(){
        return this.gameClient.getGames();
    }
}
