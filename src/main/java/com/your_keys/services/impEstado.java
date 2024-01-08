package com.your_keys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.your_keys.dao.daoEstado;
import com.your_keys.entity.Estado;


@Service
public class impEstado implements serEstado {

	@Autowired
	private daoEstado dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Estado> findAll() {
		// TODO Auto-generated method stub
		return (List<Estado>) dao.findAll();
	}

	@Override
	@Transactional
	public Estado save(Estado estado) {
		// TODO Auto-generated method stub
		return dao.save(estado);
	}

	@Override
	@Transactional(readOnly = true)
	public Estado findById(Long id_estado) {
		// TODO Auto-generated method stub
		return dao.findById(id_estado).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_estado) {
		// TODO Auto-generated method stub
		dao.deleteById(id_estado);
		
	}

	 
}
