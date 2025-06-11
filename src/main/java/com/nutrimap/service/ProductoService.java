package com.nutrimap.service;

import com.nutrimap.model.Producto;
import com.nutrimap.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para lógica de negocio de productos
 * Implementa operaciones CRUD básicas
 * @author Miguel Paba
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
    
    /**
     * Busca un producto por ID
     * @param id identificador del producto
     * @return Optional con el producto si existe
     */
    public Optional<Producto> buscarPorId(Long id) {
        return productoRepository.findById(id);
    }
    
    /**
     * Busca productos por nombre
     * @param nombre término de búsqueda
     * @return Lista de productos encontrados
     */
    public List<Producto> buscarPorNombre(String nombre) {
        return productoRepository.findByNombreContainingIgnoreCase(nombre);
    }
    
    /**
     * Obtiene productos con stock disponible
     * @return Lista de productos con stock > 0
     */
    public List<Producto> productosDisponibles() {
        return productoRepository.findByStockGreaterThan(0);
    }
}