package com.playerdata.server.controller;

import com.playerdata.server.model.Player;
import com.playerdata.server.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // to handle HTTP requests and returning JSON-data
@RequestMapping("/players") // maps the url
@CrossOrigin // (will update with origin later)
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/")
    public List<Player> findAllPlayers() {
        return playerService.findAllPlayers();
    }
}
