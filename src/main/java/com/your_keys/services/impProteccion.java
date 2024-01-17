package com.your_keys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.your_keys.dao.daoProteccion;
import com.your_keys.entity.Proteccion;

@Service
public class impProteccion implements serProteccion{
	
	@Autowired
	private daoProteccion dao;
	
	@Override
	public List<Proteccion> findAll() {
		// TODO Auto-generated method stub
		return (List<Proteccion>) dao.findAll();
	}

	@Override
	public Proteccion save(Proteccion proteccion) {
		// TODO Auto-generated method stub
		return dao.save(proteccion);
	}

	@Override
	public Proteccion findById(Long id_proteccion) {
		// TODO Auto-generated method stub
		return dao.findById(id_proteccion).orElse(null);
	}

	@Override
	public void delete(Long id_devolución) {
		// TODO Auto-generated method stub
		dao.deleteById(id_devolución);
	}

}
