package com.your_keys.services;

import java.util.List;

import com.your_keys.entity.Devolucion;
import com.your_keys.entity.Proteccion;

public interface serProteccion {
	public List<Proteccion>findAll();
	public Proteccion save(Proteccion id_devolución);
	public Proteccion findById(Long id_devolución);
	public void delete(Long id_devolución);
}
