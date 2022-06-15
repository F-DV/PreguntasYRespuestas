package com.project.questionandanswers.application.controllers;

import com.project.questionandanswers.application.mappers.PlayerRestMapper;
import com.project.questionandanswers.application.model.PlayerDto;
import com.project.questionandanswers.application.model.request.PlayerRequest;
import com.project.questionandanswers.application.model.response.PlayerResponse;
import com.project.questionandanswers.application.services.PlayerService;
import com.project.questionandanswers.domain.model.PlayerModel;
import com.project.questionandanswers.domain.ports.PlayerServicePort;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class PlayerController {

    PlayerRestMapper mapper = Mappers.getMapper(PlayerRestMapper.class);

    private final PlayerServicePort playerServicePort;

    public PlayerController(PlayerServicePort playerServicePort) {
        this.playerServicePort = playerServicePort;
    }

    @PostMapping(path = "/savePlayer")
    public PlayerResponse savePlayer(@RequestBody PlayerRequest playerRequest){
        PlayerModel playerModel = mapper.maptoPlayerModel(playerRequest);
        PlayerResponse playerResponse = mapper.maptoPlayerResponse(this.playerServicePort.savePlayer(playerModel));
        return playerResponse;
    }

    @GetMapping(path = "/getAllPlayers")
    public List<PlayerResponse> getAllPlayers(){
        List<PlayerResponse> players = this.playerServicePort
                .findAllPlayers()
                .stream()
                .map(player -> mapper.maptoPlayerResponse(player))
                .collect(Collectors.toList());
        return players;
    }
}
