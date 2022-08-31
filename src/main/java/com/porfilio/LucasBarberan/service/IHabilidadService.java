/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfilio.LucasBarberan.service;

import com.porfilio.LucasBarberan.model.habilidadModel;
import java.util.List;

/**
 *
 * @author lucas
 */
public interface IHabilidadService {
    
    public  List<habilidadModel> verHabilidades();
    
    public void modificarHabilidad(long id, habilidadModel habilidad);
    
    public void eliminarHabilidad(long id);
    
    public void agregarHabilidad(habilidadModel habilidad);
}
