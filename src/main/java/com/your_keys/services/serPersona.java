package com.your_keys.services;

import java.util.List;
import com.your_keys.entity.Persona;

public interface serPersona {
	public List<Persona>findAll();
	public Persona save(Persona persona);
	public Persona findById(Long id_persona);
	public void delete(Long id_persona);
}
