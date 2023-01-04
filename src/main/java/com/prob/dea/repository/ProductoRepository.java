/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prob.dea.repository;

import com.prob.dea.model.Producto;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pepe
 */
@Repository
public interface ProductoRepository extends JpaRepository <Producto, Integer>{
    
    Optional<Producto> findByNombre(String nombre);
    boolean existsByNombre(String nombre);
    
}
