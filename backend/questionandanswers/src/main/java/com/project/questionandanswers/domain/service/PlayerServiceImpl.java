package com.project.questionandanswers.domain.service;

import com.project.questionandanswers.domain.model.PlayerModel;
import com.project.questionandanswers.domain.ports.PlayerPersistencePort;
import com.project.questionandanswers.domain.ports.PlayerServicePort;

import java.util.List;

public class PlayerServiceImpl implements PlayerServicePort {

    private final PlayerPersistencePort playerPersistencePort;

    public PlayerServiceImpl(PlayerPersistencePort playerPersistencePort) {
        this.playerPersistencePort = playerPersistencePort;
    }

    @Override
    public List<PlayerModel> findAllPlayers() {
        return playerPersistencePort.findAllPlayers();
    }

    @Override
    public PlayerModel savePlayer(PlayerModel playerModel) {
        return playerPersistencePort.savePlayer(playerModel);
    }
}
