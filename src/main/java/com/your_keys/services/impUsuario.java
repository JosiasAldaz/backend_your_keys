package com.your_keys.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.your_keys.dao.daoUsuario;
import com.your_keys.entity.Usuario;

@Service
public class impUsuario implements serUsuario {

	@Autowired
	private daoUsuario dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>)dao.findAll();
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		return dao.save(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id_usuario) {
		return dao.findById(id_usuario).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_usuario) {
		dao.deleteById(id_usuario);
	}
}
