package com.example.fashionshop.services.impl;

import com.example.fashionshop.entities.Team;
import com.example.fashionshop.repositories.ITeamRepo;
import com.example.fashionshop.services.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService implements ITeamService {
    @Autowired
    private ITeamRepo iTeamRepo;

    @Override
    public List<Team> findAll() {
        return iTeamRepo.findAll();
    }

    @Override
    public Team save(Team team) {
        return iTeamRepo.save(team);
    }

    @Override
    public Team update(Long id, Team team) {
        if (iTeamRepo.existsById(id)) {
            return iTeamRepo.save(team);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        if (iTeamRepo.existsById(id)) {
            iTeamRepo.deleteById(id);
        }
        else {
            System.out.println("Không thể xóa đối tượng");
        }
    }
}
