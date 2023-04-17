package ar.edu.unju.fi.soo.champions.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.soo.champions.entity.Player;
import ar.edu.unju.fi.soo.champions.entity.Team;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long>{

	Player findByNum(int numero);

	List<Player> findByPosition(String position);

	List<Player> findByTeamAndPosition(Team team, String position);

}
