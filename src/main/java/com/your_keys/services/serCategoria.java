package com.your_keys.services;

import java.util.List;

import com.your_keys.entity.Categoria;


public interface serCategoria {
	public List<Categoria>findAll();
	public Categoria save(Categoria categoria);
	public Categoria findById(Long id_categoria);
	public void delete(Long id_categoria);

}
