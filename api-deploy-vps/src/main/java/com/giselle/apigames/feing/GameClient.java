package com.giselle.apigames.feing;

import com.giselle.apigames.domain.Game;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
    @FeignClient(name = "games-api", url = "https://games-api.s3.us-east-2.amazonaws.com")
    public interface GameClient {
        @GetMapping("/games.json")
        List<Game> getGames();

    }
