/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prob.dea.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.*;

/**
 *
 * @author Pepe
 */
@Getter @Setter
public class ProductoDto {
   
   @NotBlank
    private String nombre;
   @Min(0)
    private Float precio;

    public ProductoDto() {
    }

    public ProductoDto(@NotBlank String nombre, @Min(0) Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
}
