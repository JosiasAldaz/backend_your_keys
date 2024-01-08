package com.your_keys.services;
import java.util.List;
import com.your_keys.entity.Marca;


public interface serMarca {
	public List<Marca>findAll();
	public Marca save(Marca marca);
	public Marca findById(Long id_marca);
	public void delete(Long id_marca);

}
