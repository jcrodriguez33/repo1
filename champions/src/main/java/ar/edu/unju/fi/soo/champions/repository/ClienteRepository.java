package ar.edu.unju.fi.soo.champions.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.soo.champions.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
