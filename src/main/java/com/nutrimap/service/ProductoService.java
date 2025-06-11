package com.nutrimap.service;

import com.nutrimap.model.Producto;
import com.nutrimap.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Servicio para lógica de negocio de productos
 * Implementa operaciones CRUD básicas
 */
@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;
    
    /**
     * Obtiene todos los productos
     * @return Lista de productos
     */
    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }
    
    /**
     * Guarda un nuevo producto
     * @param producto Producto a guardar
     * @return Producto guardado
     */
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }
}
