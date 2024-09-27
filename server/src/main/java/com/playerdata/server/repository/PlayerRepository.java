package com.playerdata.server.repository;

import com.playerdata.server.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Spring Data Repository specified to be able to perform database (CRUD) operations on the Player entity.
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
