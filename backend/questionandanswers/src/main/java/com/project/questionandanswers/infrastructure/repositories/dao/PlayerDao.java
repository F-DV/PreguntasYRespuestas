package com.project.questionandanswers.infrastructure.repositories.dao;

import com.project.questionandanswers.infrastructure.entities.Player;
import java.util.List;

public interface PlayerDao {

    List<Player> findAllPlayers();
    List<Player> savePlayer(Player player);
}
