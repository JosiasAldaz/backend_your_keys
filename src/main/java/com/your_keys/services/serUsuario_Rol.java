package com.your_keys.services;

import java.util.List;
import com.your_keys.entity.Usuario_Rol;

public interface serUsuario_Rol {
	public List<Usuario_Rol>findAll();
	public Usuario_Rol save(Usuario_Rol usuario_rol);
	public Usuario_Rol findById(Long id_usuario_rol);
	public void delete(Long id_usuario_rol);
}
