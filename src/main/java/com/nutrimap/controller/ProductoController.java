package com.nutrimap.controller;

import com.nutrimap.model.Producto;
import com.nutrimap.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Controlador REST para productos
 * Maneja peticiones HTTP para el módulo de productos
 * @author Miguel Paba
 */
@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    /**
     * Endpoint para listar todos los productos
     * GET /api/productos
     * @return Lista de todos los productos
     */
    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarTodos();
    }
    
    /**
     * Endpoint para crear un nuevo producto
     * POST /api/productos
     * @param producto Datos del nuevo producto
     * @return Producto creado
     */
    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.guardar(producto);
    }
    
    /**
     * Endpoint para buscar un producto por ID
     * GET /api/productos/{id}
     * @param id Identificador del producto
     * @return Producto encontrado o 404 si no existe
     */
    @GetMapping("/{id}")
    public ResponseEntity<Producto> buscarPorId(@PathVariable Long id) {
        return productoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    /**
     * Endpoint para buscar productos por nombre
     * GET /api/productos/buscar?nombre=xxx
     * @param nombre Término de búsqueda
     * @return Lista de productos que coinciden
     */
    @GetMapping("/buscar")
    public List<Producto> buscarPorNombre(@RequestParam String nombre) {
        return productoService.buscarPorNombre(nombre);
    }
    
    /**
     * Endpoint para obtener productos disponibles
     * GET /api/productos/disponibles
     * @return Lista de productos con stock > 0
     */
    @GetMapping("/disponibles")
    public List<Producto> productosDisponibles() {
        return productoService.productosDisponibles();
    }
}