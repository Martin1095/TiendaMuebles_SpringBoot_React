package com.tiendaMuebles.tienda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tiendaMuebles.tienda.DTO.ProductoDTO;
import com.tiendaMuebles.tienda.model.Producto;
import com.tiendaMuebles.tienda.repository.ProductoRepository;

public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ProductoValidaciones productoValidaciones;

    // Buscar producto por id
    public ProductoDTO obtenerProductoPorId(Integer id_producto){
        Producto producto = productoRepository.findById(id_producto)
                    .orElseThrow(() -> new RuntimeException("Producto no encontrado con el ID: " + id_producto));
        return productoValidaciones.convertirADTO(producto);
    }

    // Obtener todos los artículos
    public List<ProductoDTO> obtenerProductos(){
        List<ProductoDTO> listaDTOs = new ArrayList<>();
        for (Producto producto : productoRepository.findAll()) {
            listaDTOs.add(productoValidaciones.convertirADTO(producto));
        }
        return listaDTOs;
    }

    
}
