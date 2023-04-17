package ar.edu.unju.fi.soo.champions.repository;

import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.fi.soo.champions.entity.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{

	Team findByName(String nombre);
}
