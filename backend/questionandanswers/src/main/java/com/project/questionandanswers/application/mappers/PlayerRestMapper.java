package com.project.questionandanswers.application.mappers;

import com.project.questionandanswers.application.model.PlayerDto;
import com.project.questionandanswers.application.model.request.PlayerRequest;
import com.project.questionandanswers.application.model.response.PlayerResponse;
import com.project.questionandanswers.domain.model.PlayerModel;
import com.project.questionandanswers.infrastructure.entities.Player;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface PlayerRestMapper {

    @Mappings({
            @Mapping(target = "namePlayer",source = "name"),
    })
    PlayerResponse maptoPlayerResponse(PlayerModel playerModel);

    @Mappings({
            @Mapping(target = "namePlayer",source = "name"),
    })
    PlayerRequest mapToPlayerRequest(PlayerModel playerModel);

    @InheritInverseConfiguration
    PlayerModel maptoPlayerModel(PlayerRequest playerRequest);
}
