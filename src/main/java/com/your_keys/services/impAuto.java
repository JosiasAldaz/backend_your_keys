package com.your_keys.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.your_keys.dao.daoAuto;
import com.your_keys.entity.Auto;


@Service
public class impAuto  implements serAuto{
	
	@Autowired
	private daoAuto dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Auto> findAll() {
		// TODO Auto-generated method stub
		return (List<Auto>) dao.findAll();
	}

	@Override
	public Auto save(Auto auto) {
		// TODO Auto-generated method stub
		return dao.save(auto);
	}

	@Override
	@Transactional(readOnly = true)
	public Auto findById(Long id_auto) {
		// TODO Auto-generated method stub
		return dao.findById(id_auto).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_auto) {
		 dao.deleteById(id_auto);
		
	}

}
