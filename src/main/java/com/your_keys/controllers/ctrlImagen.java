package com.your_keys.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.your_keys.services.serImagen;

import java.io.IOException;
import java.net.MalformedURLException;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ctrlImagen {

	@Autowired
	private serImagen service;
	
	@GetMapping("/imagenes/{filename}")
	public ResponseEntity<Resource> buscar(@PathVariable String filename){
		Resource resource = null;
		try {
			resource = service.load(filename);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\""+ resource.getFilename()+"\"").
				body(resource);
	}
	
	@PostMapping("/imagenes")
	public ResponseEntity<String> subirImagen(@RequestParam("file") MultipartFile file) {
	    try {
	        String url_imagen = "http://localhost:8080/api/imagenes/" + service.copy(file);
	        return ResponseEntity.ok(url_imagen);
	    } catch (IOException e) {
	        e.printStackTrace();
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al subir la imagen.");
	    }
	}


	
	@DeleteMapping("/imagenes/{filename}")
    public ResponseEntity<String> eliminarImagen(@PathVariable String filename) {
        boolean eliminacionExitosa = service.delete(filename);

        if (eliminacionExitosa) {
            return ResponseEntity.ok("Imagen eliminada con éxito: " + filename);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar la imagen: " + filename);
        }
    }
}

