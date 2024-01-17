package com.your_keys.services;

import java.util.List;

import com.your_keys.entity.Cliente;

public interface serCliente {
	public List<Cliente>findAll();
	public Cliente save(Cliente cliente);
	public Cliente findById(Long id_cliente);
	public void delete(Long id_cliente);
}
