package ar.edu.unju.fi.soo.champions.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.soo.champions.entity.Team;
import ar.edu.unju.fi.soo.champions.repository.TeamRepository;
import ar.edu.unju.fi.soo.champions.service.ChampionsService;

@Service
public class ChampionsServiceImpl implements ChampionsService{
	@Autowired
	private TeamRepository teamRepository;

	@Override
	public Team findTeamByName(String name) {
		// TODO Auto-generated method stub
		return teamRepository.findByName(name);
	}
}
