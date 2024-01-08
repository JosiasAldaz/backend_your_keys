package com.your_keys.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.your_keys.dao.daoPersona;
import com.your_keys.entity.Persona;

@Service
public class impPersona implements serPersona {

	@Autowired
	daoPersona dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		return (List<Persona>)dao.findAll();
	}

	@Override
	@Transactional
	public Persona save(Persona persona) {
		return dao.save(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findById(Long id_persona) {
		return dao.findById(id_persona).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_persona) {
		dao.deleteById(id_persona);
	}
	
}
