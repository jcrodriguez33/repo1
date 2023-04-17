package ar.edu.unju.fi.soo.champions.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "cliente_id", nullable = true)
//    private Cliente adherente;
//    
//	public Cliente getAdherente() {
//		return adherente;
//	}
//
//	public void setAdherente(Cliente adherente) {
//		this.adherente = adherente;
//	}
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Cliente> clientes;   
    
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cliente() {
		super();
	}
    
}
