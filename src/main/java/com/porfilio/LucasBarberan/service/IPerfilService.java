/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfilio.LucasBarberan.service;

import com.porfilio.LucasBarberan.model.perfilModel;
import java.util.List;

/**
 *
 * @author lucas
 */
public interface IPerfilService {
    public List<perfilModel> verPerfil();
    
    public void agregarPerfil(perfilModel perfil);
    
    public void eliminarPerfil(long id);
    
    public void modificarPerfil(long id, perfilModel perfil);
    
    
}
