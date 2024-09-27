package com.playerdata.server.service;

import com.playerdata.server.model.Player;

import java.util.List;

// Interface for defining the blueprint of the player service implementation
public interface PlayerService {
    List<Player> findAllPlayers();
}
