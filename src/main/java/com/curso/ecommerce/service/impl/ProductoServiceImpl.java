package com.curso.ecommerce.service.impl;

import com.curso.ecommerce.model.Producto;
import com.curso.ecommerce.repository.ProductoRepository;
import com.curso.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto save(Producto p) {
        return productoRepository.save(p);
    }

    @Override
    public Producto get(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void delete(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }
}
