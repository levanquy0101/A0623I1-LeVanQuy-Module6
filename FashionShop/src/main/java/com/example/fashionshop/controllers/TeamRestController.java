package com.example.fashionshop.controllers;

import com.example.fashionshop.entity.Team;
import com.example.fashionshop.services.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team")
@CrossOrigin(origins = "*")
public class TeamRestController {
    @Autowired
    private ITeamService iTeamService;
    @GetMapping("")
    @ResponseBody
    public List<Team> getAll() {
        return iTeamService.findAll();
    }

    @PostMapping("/create")
    @ResponseBody
    public Team createTeam(@RequestBody Team team) {
        return iTeamService.save(team);
    }
    @PutMapping("/update/{id}")
    @ResponseBody
    public Team updateTeam(@PathVariable Long id, @RequestBody Team team) {
        return iTeamService.update(id, team);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteTeam(@PathVariable Long id) {
        iTeamService.delete(id);
    }
}

