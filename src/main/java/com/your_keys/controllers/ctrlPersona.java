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
import com.your_keys.entity.Persona;
import com.your_keys.services.serPersona;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ctrlPersona {
	
	@Autowired
	private serPersona service;
	
	@GetMapping("/personas")
	public List<Persona> listar(){
		return service.findAll();
	}
	
	@GetMapping("/personas/{id}")
	public Persona buscar(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/personas")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona crear(@RequestBody Persona body) {
		return service.save(body);
	}
	
	@PutMapping("/personas/{id}")
	public Persona actualizar(@RequestBody Persona body, @PathVariable Long id) {
		Persona persona = service.findById(id);
		persona.setNombre1(body.getNombre1());
		persona.setNombre2(body.getNombre2());
		persona.setApellido1(body.getApellido1());
		persona.setApellido2(body.getApellido2());
		persona.setTelefono(body.getTelefono());
		persona.setDireccion(body.getDireccion());
		persona.setFecha_nac(body.getFecha_nac());
		persona.setCorreo(body.getCorreo());
		persona.setUrl_imagen(body.getUrl_imagen());
		return service.save(persona);
	}
	
	@DeleteMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		service.delete(id);
	}
}
