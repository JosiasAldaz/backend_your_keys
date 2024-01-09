package com.your_keys.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.your_keys.dao.daoCliente;
import com.your_keys.entity.Categoria;
import com.your_keys.entity.Cliente;

public class impCliente implements serCliente{

	private daoCliente dao;
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) dao.findAll();
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return  dao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id_cliente) {
		// TODO Auto-generated method stub
		return dao.findById(id_cliente).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public void delete(Long id_cliente) {
		// TODO Auto-generated method stub
		dao.deleteById(id_cliente);
	}

}
