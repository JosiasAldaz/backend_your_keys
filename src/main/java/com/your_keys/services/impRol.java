package com.your_keys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.your_keys.dao.daoRol;
import com.your_keys.entity.Rol;

@Service
public class impRol implements serRol {

	@Autowired
	private daoRol dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Rol> findAll() {
		return (List<Rol>) dao.findAll();
	}

	@Override
	@Transactional
	public Rol save(Rol rol) {
		return dao.save(rol);
	}

	@Override
	@Transactional(readOnly=true)
	public Rol findById(Long id_rol) {
		return dao.findById(id_rol).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_rol) {
		dao.deleteById(id_rol);
	}
}
