package com.your_keys.dao;

import org.springframework.data.repository.CrudRepository;
import com.your_keys.entity.Usuario;

public interface daoUsuario extends CrudRepository<Usuario, Long> {

}
