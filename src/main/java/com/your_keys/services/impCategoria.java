package com.your_keys.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.your_keys.dao.daoCategoria;
import com.your_keys.entity.Categoria;

@Service
public class impCategoria implements serCategoria {
	
	@Autowired
	private daoCategoria dao;

	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) dao.findAll();
	}

	@Override
	@Transactional
	public Categoria save(Categoria categoria) {
		// TODO Auto-generated method stub
		return  dao.save(categoria);
	}

	@Override
	@Transactional(readOnly = true)
	public Categoria findById(Long id_categoria) {
		// TODO Auto-generated method stub
		return dao.findById(id_categoria).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_categoria) {
		// TODO Auto-generated method stub
		 dao.deleteById(id_categoria);
	}

}
