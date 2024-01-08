package com.your_keys.services;
import java.util.List;

import com.your_keys.entity.Estado;


public interface serEstado {
	
	public List<Estado>findAll();
	public Estado save(Estado estado);
	public Estado findById(Long id_estado);
	public void delete(Long id_estado);

}
