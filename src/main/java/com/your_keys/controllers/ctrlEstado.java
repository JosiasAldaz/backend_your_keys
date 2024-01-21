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
import com.your_keys.entity.Estado;
import com.your_keys.services.serEstado;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlEstado {
	
	@Autowired
	private serEstado ser;
	
	@GetMapping("/estados")
	public List<Estado> listar(){
		return ser.findAll();
	}
	
	@GetMapping("/estados/{id}")
	public Estado buscar(@PathVariable Long id) {
		return ser.findById(id);
	}
	
	@PostMapping("/estados")
	@ResponseStatus(HttpStatus.CREATED)
	public Estado crear(@RequestBody Estado body) {
		return ser.save(body);
	}
	
	@PutMapping("/estados/{id}")
	public Estado actualizar(@RequestBody Estado body, @PathVariable Long id) {
		Estado rpd = ser.findById(id);
		rpd.setNombre(body.getNombre());
		return ser.save(rpd);
	}
	
	@DeleteMapping("estados/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar (@PathVariable Long id) {
		ser.delete(id);
	}

}
