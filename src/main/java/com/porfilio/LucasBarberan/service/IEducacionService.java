/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfilio.LucasBarberan.service;

import com.porfilio.LucasBarberan.model.educacionModel;
import java.util.List;

/**
 *
 * @author lucas
 */
public interface IEducacionService {
    public List<educacionModel> verEducaciones();
    
    public void modificarEducacion(long id, educacionModel educacion);
    
    public void eliminarEducacion(long id);
    
    public void agregarEducacion(educacionModel educacion);
}
