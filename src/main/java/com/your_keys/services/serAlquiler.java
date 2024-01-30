package com.your_keys.services;

import java.util.List;

import com.your_keys.entity.Alquiler;

public interface serAlquiler {
	public List<Alquiler> findAll();
	public Alquiler Save(Alquiler alquiler);
	public Alquiler findById(Long id_alquiler);
	public void delete(Long id_alquiler);
	
}
