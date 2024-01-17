package com.your_keys.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.your_keys.entity.Usuario_Rol;
import com.your_keys.services.serUsuario_Rol;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlUsuario_Rol {
	
	@Autowired
	private serUsuario_Rol service;
	
	@GetMapping("/usuarios_roles")
	public List<Usuario_Rol> listar(){
		return service.findAll();
	}
	
	@GetMapping("/usuarios_roles/{id}")
	public Usuario_Rol buscar(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/usuarios_roles")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario_Rol crear(@RequestBody Usuario_Rol body) {
		return service.save(body);
	}
	
	@DeleteMapping("/usuarios_roles/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		service.delete(id);
	}
}
