package com.example.fashionshop.repositories;

import com.example.fashionshop.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeamRepo extends JpaRepository<Team,Long> {
}
