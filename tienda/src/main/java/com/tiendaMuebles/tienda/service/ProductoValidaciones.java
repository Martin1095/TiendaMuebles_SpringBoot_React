package com.tiendaMuebles.tienda.service;

import org.springframework.stereotype.Service;

import com.tiendaMuebles.tienda.DTO.ProductoDTO;
import com.tiendaMuebles.tienda.model.Producto;

@Service 
public class ProductoValidaciones {

    public Boolean validarNullVacio(Producto producto){
        if(producto.getNombre_producto() == null || producto.getNombre_producto().trim().length() == 0){
            return false;
        }
        if(producto.getTipo_madera() == null || producto.getTipo_madera().trim().length() == 0){
            return false;
        }
        if(producto.getMedida_ancho() == null || producto.getMedida_ancho() == 0){
            return null;
        }
        if(producto.getMedida_altura() == null || producto.getMedida_altura() == 0){
            return null;
        }
        if(producto.getMedida_profundidad() == null || producto.getMedida_profundidad() == 0){
            return null;
        }
        if(producto.getPeso() == null || producto.getPeso() == 0){
            return null;
        }
        return true;
    }

    // Convertir entidad a DTO
    ProductoDTO convertirADTO(Producto producto) {
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setId_producto(producto.getId_producto());
        productoDTO.setNombre_producto(producto.getNombre_producto());
        productoDTO.setTipo_madera(producto.getTipo_madera());
        productoDTO.setMedida_ancho(producto.getMedida_ancho());
        productoDTO.setMedida_altura(producto.getMedida_altura());
        productoDTO.setMedida_profundidad(producto.getMedida_profundidad());
        productoDTO.setPeso(producto.getPeso());
        return productoDTO;
    }
}