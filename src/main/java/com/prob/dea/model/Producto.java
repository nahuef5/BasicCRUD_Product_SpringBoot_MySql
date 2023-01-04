/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prob.dea.model;


import javax.persistence.*;
import lombok.*;
/**
 *
 * @author Pepe
 */
@Entity
@Getter @Setter
public class Producto {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private Float precio;

    public Producto(String nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }
    
}
