package com.project.questionandanswers.application.config;

import com.project.questionandanswers.domain.ports.PlayerPersistencePort;
import com.project.questionandanswers.domain.ports.PlayerServicePort;
import com.project.questionandanswers.domain.service.PlayerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfig {

    @Bean
    public PlayerServicePort playerServicee(PlayerPersistencePort playerPersistencePort){
        return new PlayerServiceImpl(playerPersistencePort);
    }
}
