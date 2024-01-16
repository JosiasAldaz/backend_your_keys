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
import com.your_keys.entity.Modelo;
import com.your_keys.services.serModelo;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ctrlModelo {

	@Autowired
	private serModelo ser;

	@GetMapping("/modelos")
	public List<Modelo> listar() {
		return ser.findAll();
	}

	@GetMapping("/modelos/{id}")
	public Modelo buscar(@PathVariable Long id) {
		return ser.findById(id);
	}
	
	@PostMapping("/modelos")
	@ResponseStatus(HttpStatus.CREATED)
	public Modelo crear(@RequestBody Modelo body) {
		return ser.save(body);
	}
	
	@PutMapping("/modelos/{id}")
	public Modelo actualizar(@RequestBody Modelo body, @PathVariable Long id) {
		Modelo rpd = ser.findById(id);
		rpd.setNombre(body.getNombre());
		rpd.setId_marca(body.getId_marca());
		return ser.save(rpd);
	}
	@DeleteMapping("/modelos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar (@PathVariable Long id) {
		ser.delete(id);
	}
	
	
}
