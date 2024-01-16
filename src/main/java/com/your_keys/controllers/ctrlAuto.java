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
import com.your_keys.entity.Auto;
import com.your_keys.services.serAuto;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlAuto {
	
	@Autowired
	private serAuto ser;
	
	@GetMapping("/autos")
	public List<Auto> listar(){
		return ser.findAll();
	}
	
	@GetMapping("/autos/{id}")
	public Auto buscar(@PathVariable Long id) {
		return ser.findById(id);
	}
	
	@PostMapping("/autos")
	@ResponseStatus(HttpStatus.CREATED)
	public Auto crear(@RequestBody Auto body) {
		return ser.save(body);
	}
	
	@PutMapping("/autos/{id}")
	public Auto actualizar(@RequestBody Auto body, @PathVariable Long id) {
		Auto rpd = ser.findById(id);
		rpd.setCapacidad(body.getCapacidad());
		rpd.setColor(body.getColor());
		rpd.setId_categoria(body.getId_categoria());
		rpd.setId_estado(body.getId_estado());
		rpd.setId_modelo(body.getId_modelo());
		rpd.setMatricula(body.getMatricula());
		rpd.setPotencia(body.getPotencia());
		rpd.setPrecio_diario(body.getPrecio_diario());
		rpd.setUrl_imagen(body.getUrl_imagen());
		return ser.save(rpd);
	}
	
	@DeleteMapping("/autos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		ser.delete(id);
	}
	
	
	

}
