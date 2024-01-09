package com.your_keys.services;

import java.util.List;

import com.your_keys.dao.daoProteccion;
import com.your_keys.entity.Cliente;
import com.your_keys.entity.Proteccion;

public class impProteccion implements serProteccion{

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
	public Proteccion findById(Long id_devolución) {
		// TODO Auto-generated method stub
		return dao.findById(id_devolución).orElse(null);
	}

	@Override
	public void delete(Long id_devolución) {
		// TODO Auto-generated method stub
		dao.deleteById(id_devolución);
	}

}
