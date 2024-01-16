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
import com.your_keys.entity.Marca;
import com.your_keys.services.serMarca;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlMarca {
	
	@Autowired
	private serMarca ser;
	
	
	@GetMapping("/marcas")
	public List<Marca> listar(){
		return ser.findAll();
	}
	
	@GetMapping("/marcas/{id}")
	public Marca buscar(@PathVariable Long id) {
		return ser.findById(id);
	}
	

	@PostMapping("/marcas")
	@ResponseStatus(HttpStatus.CREATED)
	public Marca crear(@RequestBody Marca body) {
		return ser.save(body);
	}
	
	@PutMapping("/marcas/{id}")
	public Marca actualizar(@RequestBody Marca body, @PathVariable Long id) {
		Marca rpd = ser.findById(id);
		rpd.setNombre(body.getNombre());
		return ser.save(rpd);
	}
	
	@DeleteMapping("/marcas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar (@PathVariable Long id) {
		ser.delete(id);
	}
	
	

}
