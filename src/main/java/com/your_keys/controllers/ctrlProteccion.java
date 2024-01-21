package com.your_keys.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.your_keys.entity.Proteccion;
import com.your_keys.services.serProteccion;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlProteccion {
	
	
	@Autowired
	private serProteccion ser;
	
	@GetMapping("/protecciones")
	public List<Proteccion> listar(){
		return ser.findAll();
	}
	
	@GetMapping("/protecciones/{id}")
	public Proteccion buscar(@PathVariable Long id) {
		return ser.findById(id);
	}
	
	 
	@PostMapping("/protecciones")
	@ResponseStatus(HttpStatus.CREATED)
	public Proteccion crear(@RequestBody Proteccion body) {
		return ser.save(body);
	}
	
	@PutMapping("/protecciones/{id}")
	public Proteccion actualizar(@RequestBody Proteccion body, @PathVariable Long id) {
	Proteccion rpd = ser.findById(id);
	rpd.setNombre(body.getNombre());
	rpd.setPrecio(body.getPrecio());
	return ser.save(rpd);
}
	
}