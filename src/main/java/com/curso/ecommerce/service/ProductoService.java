package com.curso.ecommerce.service;

import com.curso.ecommerce.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    Producto save(Producto p);
    Optional<Producto> get(Long id);
    void update(Producto producto);
    void delete(Long id);
    List<Producto> findAll();
}
