package com.your_keys.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.your_keys.dao.daoMarca;
import com.your_keys.entity.Marca;


@Service
public class impMarca implements serMarca{
	
	@Autowired
	private daoMarca dao;

	@Override
	@Transactional(readOnly = true)
	public List<Marca> findAll() {
		// TODO Auto-generated method stub
		return (List<Marca>) dao.findAll();
	}

	@Override
	public Marca save(Marca marca) {
		// TODO Auto-generated method stub
		return dao.save(marca);
	}

	@Override
	@Transactional(readOnly = true)
	public Marca findById(Long id_marca) {
		// TODO Auto-generated method stub
		return dao.findById(id_marca).orElse(null);
	}

	@Override
	public void delete(Long id_marca) {
		// TODO Auto-generated method stub
		dao.deleteById(id_marca);
	}
 
	 

}
