package com.your_keys.services;

import java.util.List;
import com.your_keys.entity.Rol;

public interface serRol {
	public List<Rol>findAll();
	public Rol save(Rol rol);
	public Rol findById(Long id_rol);
	public void delete(Long id_rol);
}
