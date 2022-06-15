package com.mercado.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.mercado.domain.Cliente;
import com.mercado.repository.ClienteRepository;
import com.mercado.util.Transacional;

public class ClienteService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ClienteRepository clienterepository;
	
	@Transacional
	public void salvaCliente(Cliente cliente) {
		clienterepository.salvar(cliente);
	}
	
	@Transacional
	public void excluirCliente(Cliente cliente) {
		clienterepository.excluir(cliente);
	}
}
