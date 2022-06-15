package com.project.questionandanswers.infrastructure.repositories.daoimp;

import com.project.questionandanswers.infrastructure.repositories.dao.PlayerDao;
import com.project.questionandanswers.infrastructure.entities.Player;
import com.project.questionandanswers.infrastructure.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerMySqlDaoImp implements PlayerDao {

    @Autowired
    PlayerRepository playerRepository;

    @Override
    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public List<Player> savePlayer(Player player) {
        return (List<Player>) playerRepository.save(player);
    }
}
