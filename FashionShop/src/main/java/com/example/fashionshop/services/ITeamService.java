package com.example.fashionshop.services;

import com.example.fashionshop.entity.Customer;
import com.example.fashionshop.entity.Team;

import java.util.List;

public interface ITeamService {

    List<Team> findAll();

    Team save(Team team);

    Team update(Long id, Team team);

    void delete(Long id);
}
