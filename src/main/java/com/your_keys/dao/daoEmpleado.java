package com.your_keys.dao;

import org.springframework.data.repository.CrudRepository;
import com.your_keys.entity.Empleado;

public interface daoEmpleado extends CrudRepository<Empleado, Long> {

}
