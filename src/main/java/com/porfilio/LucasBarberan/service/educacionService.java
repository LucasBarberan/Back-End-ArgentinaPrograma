/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfilio.LucasBarberan.service;

import com.porfilio.LucasBarberan.model.educacionModel;
import com.porfilio.LucasBarberan.repository.educacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lucas
 */
@Service
public class educacionService implements IEducacionService{

    @Autowired
    private educacionRepository eduRepo;
    
    
    @Override
    public List<educacionModel> verEducaciones() {
        return eduRepo.findAll();
    }

    @Override
    public void modificarEducacion(long id, educacionModel educacion) {
        educacionModel eduMod = eduRepo.findById(id).orElse(null);
        if (educacion.getInstitucion()!=null) {
            eduMod.setInstitucion(educacion.getInstitucion());
        }
        if (educacion.getCarrera()!=null){
            eduMod.setCarrera(educacion.getCarrera());
        }
        if (educacion.getEstado()!=null) {
            eduMod.setEstado(educacion.getEstado());
        }
        if (educacion.getLinkImagen()!=null) {
            eduMod.setLinkImagen(educacion.getLinkImagen());
        }
        if (educacion.getTiempoDesde()!=null) {
            eduMod.setTiempoDesde(educacion.getTiempoDesde());
        }
        if (educacion.getTiempoHasta()!=null) {
            eduMod.setTiempoHasta(educacion.getTiempoHasta());
        }
        eduRepo.save(eduMod);
    }

    @Override
    public void eliminarEducacion(long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public void agregarEducacion(educacionModel educacion) {
        System.out.println(educacion.getCarrera());
        eduRepo.save(educacion);
    }
    
}
