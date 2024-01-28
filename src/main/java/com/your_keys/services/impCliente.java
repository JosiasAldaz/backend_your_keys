package com.your_keys.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.your_keys.dao.daoCliente;
import com.your_keys.entity.Cliente;

@Service
public class impCliente implements serCliente{

	@Autowired
	private daoCliente dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) dao.findAll();
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return  dao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id_cliente) {
		return dao.findById(id_cliente).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_cliente) {
		dao.deleteById(id_cliente);
	}

}
