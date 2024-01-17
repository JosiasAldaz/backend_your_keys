package com.your_keys.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.your_keys.entity.Empleado;
import com.your_keys.services.serEmpleado;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlEmpleado {
	
	@Autowired
	private serEmpleado service;
	
	@GetMapping("/empleados")
	public List<Empleado> listar(){
		return service.findAll();
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado buscar(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/empleados")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado crear(@RequestBody Empleado body) {
		return service.save(body);
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizar(@RequestBody Empleado body, @PathVariable Long id) {
		Empleado empleado = service.findById(id);
		empleado.setSalario(body.getSalario());
		return service.save(empleado);
	}
	
	@DeleteMapping("/empleados/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		service.delete(id);
	}
}
