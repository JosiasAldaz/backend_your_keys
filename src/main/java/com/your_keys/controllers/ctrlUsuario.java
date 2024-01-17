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
import com.your_keys.entity.Usuario;
import com.your_keys.services.serUsuario;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlUsuario {
	
	@Autowired
	private serUsuario service;
	
	@GetMapping("/usuarios")
	public List<Usuario> listar(){
		return service.findAll();
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuario buscar(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario crear(@RequestBody Usuario body) {
		return service.save(body);
	}
	
	@PutMapping("/usuarios/{id}")
	public Usuario actualizar(@RequestBody Usuario body, @PathVariable Long id) {
		Usuario usuario = service.findById(id);
		usuario.setUsername(body.getUsername());
		usuario.setPassword(body.getPassword());
		return service.save(usuario);
	}
	
	@DeleteMapping("/usuarios/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		service.delete(id);
	}
}
