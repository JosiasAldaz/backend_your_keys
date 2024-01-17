package com.your_keys.services;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class impImagen implements serImagen {

	private final static String IMAGENES_FOLDER = "imagenes";
	
	@Override
	public Resource load(String filename) throws MalformedURLException {
	    Path ruta = getRuta(filename);
	    Resource resource = new UrlResource(ruta.toUri());
	    if (!resource.exists() || !resource.isReadable()) {
	        throw new RuntimeException("Error in path: " + ruta.toString());
	    }
	    return resource;
	}

	@Override
	public String copy(MultipartFile file) throws IOException {
		String uniqueFilename = UUID.randomUUID().toString()+"_"+file.getOriginalFilename();
		Path ruta = getRuta(uniqueFilename);
		Files.copy(file.getInputStream(), ruta);
		return uniqueFilename;
	}

	@Override
	public boolean delete(String filename) {
		Path ruta = getRuta(filename);
		File file = ruta.toFile();
		if (file.exists() && file.canRead()) {
			if (file.delete()) {
				return true;
			}
		} 
		return false;
	}
	
	public Path getRuta(String filename) {
		return Paths.get(IMAGENES_FOLDER).resolve(filename).toAbsolutePath();
	}
}
