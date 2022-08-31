/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfilio.LucasBarberan.service;

import com.porfilio.LucasBarberan.model.proyectoModel;
import java.util.List;

/**
 *
 * @author lucas
 */
public interface IProyectoService {
    public List<proyectoModel> verProyecto();

    public void modificarProyecto(long id, proyectoModel proyecto);
    
    public void eliminarProyecto(long id);
    
    public void agregarProyecto(proyectoModel proyecto);
}
