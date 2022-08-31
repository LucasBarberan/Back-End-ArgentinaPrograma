/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfilio.LucasBarberan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author lucas
 */
@Getter @Setter 
@Entity 
public class perfilModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nombre;
    private String descripcion;
    private String linkImagen;

    public perfilModel(long id, String nombre, String descripcion, String linkImagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.linkImagen = linkImagen;
    }

    public perfilModel() {
    }
    
}
