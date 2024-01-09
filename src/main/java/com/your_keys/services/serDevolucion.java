package com.your_keys.services;

import java.util.List;

import com.your_keys.entity.Cliente;
import com.your_keys.entity.Devolucion;

public interface serDevolucion {
	public List<Devolucion>findAll();
	public Devolucion save(Devolucion id_proteccion);
	public Devolucion findById(Long id_proteccion);
	public void delete(Long id_proteccion);
}
