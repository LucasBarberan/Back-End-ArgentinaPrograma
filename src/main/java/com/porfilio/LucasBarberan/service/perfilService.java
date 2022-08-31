/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfilio.LucasBarberan.service;

import com.porfilio.LucasBarberan.model.perfilModel;
import com.porfilio.LucasBarberan.repository.perfilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lucas
 */
@Service    
public class perfilService implements IPerfilService{
    
    @Autowired
    private perfilRepository perfRepo;

    @Override
    public List<perfilModel> verPerfil() {
        return perfRepo.findAll();
    }

    @Override
    public void agregarPerfil(perfilModel perfil) {
        perfRepo.save(perfil);
    }

    @Override
    public void eliminarPerfil(long id) {
        perfRepo.deleteById(id);
    }

    @Override
    public void modificarPerfil(long id, perfilModel perfil) {
        perfilModel perfilModel = perfRepo.findById(id).orElse(null);
        
        if (perfil.getDescripcion()!=null) {
            perfilModel.setDescripcion(perfil.getDescripcion());
        }
        if (perfil.getNombre()!=null) {
            perfilModel.setNombre(perfil.getNombre());
        }
        if (perfil.getLinkImagen()!=null) {
            perfilModel.setLinkImagen(perfil.getLinkImagen());
        }
        perfRepo.save(perfilModel);
    }
    
    
}
