package com.your_keys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.your_keys.dao.daoAlquiler;
import com.your_keys.entity.Alquiler;

@Service
public class impAlquiler implements serAlquiler{

	@Autowired
	private daoAlquiler dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Alquiler> findAll() {
		return (List<Alquiler>) dao.findAll();
	}

	@Override
	@Transactional
	public Alquiler Save(Alquiler alquiler) {
		return dao.save(alquiler);
	}

	@Override
	@Transactional(readOnly = true)
	public Alquiler findById(Long id_alquiler) {
		return dao.findById(id_alquiler).orElse(null);
	}
	
	@Override
	@Transactional
	public void delete(Long id_rol) {
		dao.deleteById(id_rol);
	}

}
