package com.your_keys.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.your_keys.dao.daoDevolucion;
import com.your_keys.entity.Alquiler;
import com.your_keys.entity.Devolucion;

public class impDevolucion implements serDevolucion{

	private daoDevolucion dao;
	@Override
	@Transactional(readOnly = true)
	public List<Devolucion> findAll() {
		// TODO Auto-generated method stub
		return  (List<Devolucion>) dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Devolucion save(Devolucion devolucion) {
		// TODO Auto-generated method stub
		return dao.save(devolucion);
	}

	@Override
	@Transactional(readOnly = true)
	public Devolucion findById(Long id_proteccion) {
		// TODO Auto-generated method stub
		return dao.findById(id_proteccion).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public void delete(Long id_proteccion) {
		// TODO Auto-generated method stub
		dao.deleteById(id_proteccion);
	}

}