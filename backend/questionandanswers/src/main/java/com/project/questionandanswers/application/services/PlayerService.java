package com.project.questionandanswers.application.services;

import com.project.questionandanswers.infrastructure.repositories.dao.PlayerDao;
import com.project.questionandanswers.application.model.PlayerDto;
import com.project.questionandanswers.infrastructure.entities.Player;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    @Autowired
    private PlayerDao playerDao;
/*
    private PlayerMapper mapper = Mappers.getMapper(PlayerMapper.class);

    public PlayerDto savePlayer(PlayerDto playerDto){
        Player player = mapper.playerDtotoPlayer(playerDto);
        player.setDate(LocalDate.now());
        playerDao.savePlayer(player);

        return  mapper.playerToPlayerDto(player);
    }

    public List<PlayerDto> getAllPlayers(){
        List<Player> players =
                (ArrayList<Player>) playerDao.findAllPlayers();

        return (ArrayList<PlayerDto>) players
                .stream()
                .map(element -> mapper.playerToPlayerDto(element))
                .collect(Collectors.toList());

    }
*/
}
