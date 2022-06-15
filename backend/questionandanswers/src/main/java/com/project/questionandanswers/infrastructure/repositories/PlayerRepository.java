package com.project.questionandanswers.infrastructure.repositories;

import com.project.questionandanswers.infrastructure.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Long>{
}
