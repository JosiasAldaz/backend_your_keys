package com.your_keys.services;

import java.util.List;
import com.your_keys.entity.Empleado;

public interface serEmpleado {
	public List<Empleado>findAll();
	public Empleado save(Empleado empleado);
	public Empleado findById(Long id_empleado);
	public void delete(Long id_empleado);
}
