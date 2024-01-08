package com.your_keys.services;

import java.util.List;

import com.your_keys.entity.Modelo;

public interface serModelo {
	
	public List<Modelo>findAll();
	public Modelo save(Modelo modelo);
	public Modelo findById(Long id_modelo);
	public void delete(Long id_modelo);

}
