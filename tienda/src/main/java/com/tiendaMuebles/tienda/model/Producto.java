package com.tiendaMuebles.tienda.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;

    @Column(nullable = false, length = 100)
    private String nombre_producto;

    @Column(nullable = false)
    private String tipo_madera;

    @Column(nullable = false, length = 5)
    private Double medida_ancho;

    @Column(nullable = false, length = 5)
    private Double medida_altura;
    
    @Column(nullable = false, length = 5)
    private Double medida_profundidad;

    @Column(nullable = false, length = 5)
    private Double peso;

    @Column(nullable = false, length = 6)
    private int precio;
}