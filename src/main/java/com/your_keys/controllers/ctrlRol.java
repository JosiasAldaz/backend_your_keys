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
import com.your_keys.entity.Rol;
import com.your_keys.services.serRol;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlRol {
	
	@Autowired
	private serRol service;
	
	@GetMapping("/roles")
	public List<Rol> listar(){
		return service.findAll();
	}
	
	@GetMapping("/roles/{id}")
	public Rol buscar(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/roles")
	@ResponseStatus(HttpStatus.CREATED)
	public Rol crear(@RequestBody Rol body) {
		return service.save(body);
	}
	
	@PutMapping("/roles/{id}")
	public Rol actualizar(@RequestBody Rol body, @PathVariable Long id) {
		Rol rol = service.findById(id);
		rol.setNombre(body.getNombre());
		return service.save(rol);
	}
	
	@DeleteMapping("/roles/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		service.delete(id);
	}
}
