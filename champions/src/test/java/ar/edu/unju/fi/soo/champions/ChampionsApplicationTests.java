package ar.edu.unju.fi.soo.champions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ar.edu.unju.fi.soo.champions.entity.Cliente;
import ar.edu.unju.fi.soo.champions.entity.Player;
import ar.edu.unju.fi.soo.champions.entity.Team;
import ar.edu.unju.fi.soo.champions.repository.ClienteRepository;
import ar.edu.unju.fi.soo.champions.repository.PlayerRepository;
import ar.edu.unju.fi.soo.champions.repository.TeamRepository;
import ch.qos.logback.core.net.server.Client;

@SpringBootTest
class ChampionsApplicationTests {
	@Autowired
	PlayerRepository playerRepository;	
	@Autowired 
	TeamRepository teamRepository;
	@Autowired
	ClienteRepository clienteRepository;
	//@Test
	void contextLoads() {
		//FIXME Esta prueba unitaria es solo de ejemplo, por favor utilice los conceptos de la clase 4		
		System.out.println("Total de players: " + playerRepository.count());
		Player  p = new Player();
		p.setId(4L);
		p.setName("Diego");
		p.setNum(13);
		p.setPosition("Enganche");
		Team t = new Team();
		t.setId(1L);
		p.setTeam(t);
		playerRepository.save(p);
		System.out.println("Total de players: " + playerRepository.count());
	}

	//@Test
	void searchUpdate() {
		Player  p = playerRepository.findByNum(13);
		System.out.println(p.getName());
		assertNotNull(p);
		p.setName("Prueba");
		playerRepository.save(p);
		p = playerRepository.findByNum(13);
		System.out.println(p.getName());
	}

	@Test
	void search() {
		List<Player>  players = playerRepository.findByPosition("Forward");
		assertEquals(players.size(), 2);
		Player  p = playerRepository.findByNum(13);
		System.out.println(p.getName());
		p.setPosition("Forward");
		playerRepository.save(p);
		players = playerRepository.findByPosition("Forward");
		assertEquals(players.size(), 2);
	}
	
	@Test
	void searchTeam() {
		Team team = teamRepository.findByName("Barcelona");
		assertEquals(team.getPlayers().size(), 4);
		List<Player> players = playerRepository.findByTeamAndPosition(team, "Forward");
		assertEquals(players.size(), 2);
	}
	
	@Test
	void saveCliente() {
		Cliente cliente = new Cliente();
		cliente.setId(10l);
		cliente.setName("Pruenba");
	//	cliente.setClientes();
		clienteRepository.save(cliente);
		//assertEquals(clienteRepository.count(), 4);
		
//		Cliente cliente2 = new Cliente();
//		cliente2.setId(11l);
//		cliente2.setName("Pruenba otro");
//		cliente2.setAdherente(cliente);
//		clienteRepository.save(cliente2);
	}
	
}
