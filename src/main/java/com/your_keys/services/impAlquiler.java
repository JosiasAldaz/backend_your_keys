package com.your_keys.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.your_keys.dao.daoAlquiler;
import com.your_keys.entity.Alquiler;
import com.your_keys.entity.Categoria;

public class impAlquiler implements serAlquiler{

	private daoAlquiler dao;
	@Override
	@Transactional(readOnly = true)
	public List<Alquiler> findAll() {
		// TODO Auto-generated method stub
		return (List<Alquiler>) dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Alquiler Save(Alquiler alquiler) {
		// TODO Auto-generated method stub
		return dao.save(alquiler);
	}

	@Override
	@Transactional(readOnly = true)
	public Alquiler findById(Long id_alquiler) {
		// TODO Auto-generated method stub
		return dao.findById(id_alquiler).orElse(null);
	}

}
