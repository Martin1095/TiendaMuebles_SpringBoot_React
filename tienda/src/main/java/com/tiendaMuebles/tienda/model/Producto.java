package com.tiendaMuebles.tienda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder 
@Entity 
@Table (name = "Productos")
public class Producto{
    private Integer id_producto;

    private String nombre_producto;

    private String tipo_madera;

    private Double medida_ancho;

    private Double medida_altura;

    private Double medida_profundidad;
}