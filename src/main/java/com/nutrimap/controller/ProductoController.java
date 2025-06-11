package com.nutrimap.controller;

import com.nutrimap.model.Producto;
import com.nutrimap.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Controlador REST para productos
 * Maneja peticiones HTTP para el módulo de productos
 */
@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    /**
     * Endpoint para listar todos los productos
     * GET /api/productos
     */
    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarTodos();
    }
    
    /**
     * Endpoint para crear un nuevo producto
     * POST /api/productos
     */
    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.guardar(producto);
    }
}