package com.tiendaMuebles.tienda.DTO;


import lombok.Data;

@Data 
public class ProductoDTO {

    private Integer id_producto;
    private String nombre_producto;
    private String tipo_madera;
    private Double medida_ancho;
    private Double medida_altura;
    private Double medida_profundidad;
    private Double peso;
    private int precio;
}
