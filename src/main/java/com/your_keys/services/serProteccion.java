package com.your_keys.services;

import java.util.List;
import com.your_keys.entity.Proteccion;

public interface serProteccion {
    List<Proteccion> findAll();
    Proteccion save(Proteccion proteccion);
    Proteccion findById(Long id);
    void delete(Long id);
}

