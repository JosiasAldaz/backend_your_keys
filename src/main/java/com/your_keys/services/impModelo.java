package com.your_keys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.your_keys.dao.daoModelo;
import com.your_keys.entity.Modelo;

@Service
public class impModelo  implements serModelo{
	
	@Autowired
	private daoModelo dao;
	
	

	@Override
	@Transactional(readOnly = true)
	public List<Modelo> findAll() {
		 
		return (List<Modelo>) dao.findAll();
	}

	@Override
	@Transactional
	public Modelo save(Modelo modelo) {
		// TODO Auto-generated method stub
		return dao.save(modelo);
	}

	@Override
	@Transactional(readOnly = true)
	public Modelo findById(Long id_modelo) {
		// TODO Auto-generated method stub
		return dao.findById(id_modelo).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_modelo) {
		// TODO Auto-generated method stub
        dao.deleteById(id_modelo);
	}

 

}
