package ar.edu.unju.fi.soo.champions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ar.edu.unju.fi.soo.champions.entity.Team;
import ar.edu.unju.fi.soo.champions.service.ChampionsService;

@SpringBootTest
public class ServiceTest {
	@Autowired
	ChampionsService service;
	
	@Test
	void searchTeam() {
		Team team = service.findTeamByName("Barcelona");
		assertEquals(3, team.getPlayers().size());
	}
}
