package com.example.rest.service.my;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;

@JsonFormat
public class RequestDtoForTeamCreation {
    private Team team;
    private List<Developer> developers;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }
}
