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
public class habilidadModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String porcentaje;

    public habilidadModel(long id, String name, String porcentaje) {
        this.id = id;
        this.name = name;
        this.porcentaje = porcentaje;
    }

    public habilidadModel() {
    }
    
    
}
