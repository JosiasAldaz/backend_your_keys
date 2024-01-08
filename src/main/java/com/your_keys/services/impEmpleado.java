package com.your_keys.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.your_keys.dao.daoEmpleado;
import com.your_keys.entity.Empleado;

@Service
public class impEmpleado implements serEmpleado{

	@Autowired
	private daoEmpleado dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Empleado> findAll() {
		return (List<Empleado>) dao.findAll();
	}

	@Override
	@Transactional
	public Empleado save(Empleado empleado) {
		return dao.save(empleado);
	}

	@Override
	@Transactional(readOnly = true)
	public Empleado findById(Long id_empleado) {
		return dao.findById(id_empleado).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_empleado) {
		dao.deleteById(id_empleado);
	}
	
}
