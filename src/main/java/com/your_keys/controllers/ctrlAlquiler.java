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

import com.your_keys.entity.Alquiler;
import com.your_keys.entity.Auto;
import com.your_keys.services.serAlquiler;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlAlquiler {
	
	
	@Autowired
	private serAlquiler ser;
	
	@GetMapping("/alquileres")
	public List<Alquiler> listar(){
		return ser.findAll();
	}
	
	@GetMapping("/alquileres/{id}")
	public Alquiler buscar(@PathVariable Long id) {
		return ser.findById(id);
	}
	
	@PostMapping("/alquileres")
	@ResponseStatus(HttpStatus.CREATED)
	public Alquiler crear(@RequestBody Alquiler body) {
		return ser.Save(body);
	}
	
	@PutMapping("/alquileres/{id}")
	public Alquiler actualizar(@RequestBody Alquiler body, @PathVariable Long id) {
	Alquiler rpd = ser.findById(id);
	rpd.setTipo_pago(body.getTipo_pago());
	rpd.setPagado(body.isPagado());
	rpd.setFecha_reg(body.getFecha_reg());
	return ser.Save(rpd);
	
	}
	@DeleteMapping("/alquileres/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		ser.delete(id);
	}
	
}