package com.your_keys.services;

import java.util.List;
import com.your_keys.entity.Usuario;

public interface serUsuario {
	public List<Usuario>findAll();
	public Usuario save(Usuario usuario);
	public Usuario findById(Long id_usuario);
	public void delete(Long id_usuario);
}
