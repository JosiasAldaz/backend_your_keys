package com.your_keys.services;
import java.util.List;
import com.your_keys.entity.Auto;

public interface serAuto  {
	public List<Auto>findAll();
	public Auto save(Auto auto);
	public Auto findById(Long id_auto);
	public void delete(Long id_auto);
}
