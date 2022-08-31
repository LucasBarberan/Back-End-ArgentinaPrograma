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
public class educacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String institucion;
    private String linkImagen;
    private String carrera;
    private String estado;
    private String tiempoDesde;
    private String tiempoHasta;

    public educacionModel(long id, String instituto, String linkImagen, String carrera, String estado, String tiempoDesde, String tiempoHasta) {
        this.id = id;
        this.institucion = instituto;
        this.linkImagen = linkImagen;
        this.carrera = carrera;
        this.estado = estado;
        this.tiempoDesde = tiempoDesde;
        this.tiempoHasta = tiempoHasta;
    }

    public educacionModel() {
    }
    
}
