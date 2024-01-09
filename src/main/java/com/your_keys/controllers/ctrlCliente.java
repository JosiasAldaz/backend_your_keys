package com.your_keys.controllers;

import java.util.List;

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
import com.your_keys.entity.Cliente;
import com.your_keys.services.serCliente;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlCliente {
	private serCliente clientes;
	
	@GetMapping("/cliente")
	public List<Cliente> listar(){
		return clientes.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente buscar(@PathVariable Long id) {
		return clientes.findById(id);
	}
	
	@PostMapping("/cliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente crear(@RequestBody Cliente body) {
		return clientes.save(body);
	}
	
	@PutMapping("/cliente/{id}")
	public Cliente actualizar(@RequestBody Cliente body, @PathVariable Long id) {
		Cliente rpd = clientes.findById(id);
		rpd.setTipo_licencia(body.getTipo_licencia());
		rpd.setLicencia(body.getLicencia());
		return clientes.save(rpd);
	}
	
	@DeleteMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar (@PathVariable Long id) {
		clientes.delete(id);
	}
	
}
