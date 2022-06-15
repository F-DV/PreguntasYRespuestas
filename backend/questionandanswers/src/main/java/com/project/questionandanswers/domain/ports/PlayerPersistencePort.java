package com.project.questionandanswers.domain.ports;

import com.project.questionandanswers.domain.model.PlayerModel;

import java.util.List;

public interface PlayerPersistencePort {
    List<PlayerModel> findAllPlayers();
    PlayerModel savePlayer(PlayerModel playerModel);
}
