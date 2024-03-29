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

import com.your_keys.entity.Devolucion;
import com.your_keys.services.serDevolucion;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlDevolucion {
	
	@Autowired
	private serDevolucion ser;
	
	@GetMapping("/devoluciones")
	public List<Devolucion> listar(){
		return ser.findAll();
	}
	
	@GetMapping("/devoluciones/{id}")
	public Devolucion buscar(@PathVariable Long id) {
		return ser.findById(id);
	}
	 
	@PostMapping("/devoluciones")
	@ResponseStatus(HttpStatus.CREATED)
	public Devolucion crear(@RequestBody Devolucion body) {
		return ser.save(body);
	}
	
}