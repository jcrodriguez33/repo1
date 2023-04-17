package ar.edu.unju.fi.soo.champions.service;

import ar.edu.unju.fi.soo.champions.entity.Team;

public interface ChampionsService {

	Team findTeamByName(String name);

}
