package com.playerdata.server.service;

import com.playerdata.server.model.Player;
import com.playerdata.server.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired // Dependency injection of the repository to promote loose coupling to be able to call it and perform crud methods
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }
}
