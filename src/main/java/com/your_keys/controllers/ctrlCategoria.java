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
import com.your_keys.entity.Categoria;
import com.your_keys.services.serCategoria;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlCategoria {
	@Autowired
	private serCategoria ser;
	
	
	@GetMapping("/categoria")
	public List<Categoria> listar(){
		return ser.findAll();
	}
	
	@GetMapping("/categoria/{id}")
	public Categoria buscar(@PathVariable Long id) {
		return ser.findById(id);
	}
	
	@PostMapping("/categoria")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria crear(@RequestBody Categoria body) {
		return ser.save(body);
	}
	
	@PutMapping("/categoria/{id}")
	public Categoria actualizar(@RequestBody Categoria body, @PathVariable Long id) {
		Categoria rpd = ser.findById(id);
		rpd.setNombre(body.getNombre());
		return ser.save(rpd);
	}
	
	@DeleteMapping("/categoria/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar (@PathVariable Long id) {
		ser.delete(id);
	}
	
	
	

}
