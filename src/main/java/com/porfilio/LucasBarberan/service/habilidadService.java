/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfilio.LucasBarberan.service;

import com.porfilio.LucasBarberan.model.habilidadModel;
import com.porfilio.LucasBarberan.repository.habilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lucas
 */
@Service
public class habilidadService implements IHabilidadService{
    
    @Autowired
    private habilidadRepository habilidadRepo;

    @Override
    public List<habilidadModel> verHabilidades() {
        return habilidadRepo.findAll();
    }

    @Override
    public void modificarHabilidad(long id, habilidadModel habilidad) {
        habilidadModel habilidadMod = habilidadRepo.findById(id).orElse(null);
        
        if (habilidad.getName()!=null) {
            habilidadMod.setName(habilidad.getName());
        }
        if (habilidad.getPorcentaje()!=null) {
            habilidadMod.setPorcentaje(habilidad.getPorcentaje());
        }
        habilidadRepo.save(habilidadMod);
    }

    @Override
    public void eliminarHabilidad(long id) {
        habilidadRepo.deleteById(id);
    }

    @Override
    public void agregarHabilidad(habilidadModel habilidad) {
        habilidadRepo.save(habilidad);
    }
}
