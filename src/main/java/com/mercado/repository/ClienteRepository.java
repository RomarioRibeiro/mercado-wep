package com.mercado.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.mercado.domain.Cliente;

public class ClienteRepository implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager entityManager;
	
	public ClienteRepository() {
		
	}
	
	public ClienteRepository(EntityManager entityManager){
		this.entityManager = entityManager;
	}
	
	public Cliente find(Long id) {
		return entityManager.find(Cliente.class,id);
	}

	public Cliente salvar(Cliente cliente) {
		return entityManager.merge(cliente);
		
	}
	
	public void excluir(Cliente cliente) {
	cliente = find(cliente.getId());	
	 entityManager.remove(cliente);
	}
	
}
