package com.your_keys.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.your_keys.dao.daoUsuario_Rol;
import com.your_keys.entity.Usuario_Rol;

@Service
public class impUsuario_Rol implements serUsuario_Rol{

	@Autowired
	private daoUsuario_Rol dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario_Rol> findAll() {
		return (List<Usuario_Rol>)dao.findAll();
	}

	@Override
	@Transactional
	public Usuario_Rol save(Usuario_Rol usuario_rol) {
		return dao.save(usuario_rol);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario_Rol findById(Long id_usuario_rol) {
		return dao.findById(id_usuario_rol).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_usuario_rol) {
		dao.deleteById(id_usuario_rol);
	}
}
