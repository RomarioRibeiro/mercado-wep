package com.mercado.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mercado.repository.ClienteRepository;
import com.mercado.util.FaceMessages;

@Named
@ViewScoped
public class ClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ClienteRepository clienteReposytory;
	
	@Inject
	private FaceMessages faceMessages;
	
	
}
