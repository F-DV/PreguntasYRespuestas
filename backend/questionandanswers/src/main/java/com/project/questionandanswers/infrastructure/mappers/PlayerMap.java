package com.project.questionandanswers.infrastructure.mappers;

import com.project.questionandanswers.domain.model.PlayerModel;
import com.project.questionandanswers.infrastructure.entities.Player;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PlayerMap {

    @Mapping(target = "lastName",source = "last_name")
    PlayerModel playerToPlayerModel(Player player);

    @InheritInverseConfiguration
    Player playerModelToPlayer(PlayerModel playerModel);

}
