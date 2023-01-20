package com.project.questionandanswers.infrastructure.adapters;

import com.project.questionandanswers.domain.model.PlayerModel;
import com.project.questionandanswers.domain.ports.PlayerPersistencePort;
import com.project.questionandanswers.infrastructure.entities.Player;
import com.project.questionandanswers.infrastructure.mappers.PlayerMap;
import com.project.questionandanswers.infrastructure.repositories.dao.PlayerDao;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerAdapter implements PlayerPersistencePort {

    private final PlayerDao playerDao;

    PlayerMap mapper = Mappers.getMapper(PlayerMap.class);

    public PlayerAdapter(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    @Override
    public List<PlayerModel> findAllPlayers() {
        List<Player> players = playerDao.findAllPlayers();
        return players
                .stream()
                .map(player -> mapper.playerToPlayerModel(player))
                .collect(Collectors.toList());
    }

    @Override
    public PlayerModel savePlayer(PlayerModel playerModel) {
        Player player = mapper.playerModelToPlayer(playerModel);
        player.setDate(LocalDate.now());
        this.playerDao.savePlayer(player);
        return mapper.playerToPlayerModel(player);
    }
}
