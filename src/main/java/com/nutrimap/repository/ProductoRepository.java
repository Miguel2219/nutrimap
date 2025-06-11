package com.nutrimap.repository;

import com.nutrimap.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Repositorio para operaciones CRUD de Producto
 * Extiende JpaRepository para operaciones básicas de base de datos
 * @author Miguel Paba
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
    /**
     * Busca productos por nombre (búsqueda parcial)
     * @param nombre término de búsqueda
     * @return lista de productos que coinciden
     */
    List<Producto> findByNombreContainingIgnoreCase(String nombre);
    
    /**
     * Busca productos con stock disponible
     * @param stock cantidad mínima de stock
     * @return lista de productos con stock mayor al especificado
     */
    List<Producto> findByStockGreaterThan(Integer stock);
}