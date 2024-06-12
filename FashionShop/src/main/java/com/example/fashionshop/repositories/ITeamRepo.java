package com.example.fashionshop.repositories;

import com.example.fashionshop.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeamRepo extends JpaRepository<Team,Long> {
}
