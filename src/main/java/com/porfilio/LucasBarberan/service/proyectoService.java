/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfilio.LucasBarberan.service;

import com.porfilio.LucasBarberan.model.proyectoModel;
import com.porfilio.LucasBarberan.repository.proyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lucas
 */
@Service
public class proyectoService implements IProyectoService{
    
    @Autowired
    private proyectoRepository proyeRepo;

    @Override
    public List<proyectoModel> verProyecto() {
        return proyeRepo.findAll();
    }

    @Override
    public void modificarProyecto(long id, proyectoModel proyecto) {
        proyectoModel proyeMod = proyeRepo.findById(id).orElse(null);
        if (proyeMod.getDescripcion()!=null && proyeMod.getDescripcion()!="") {
            proyeMod.setDescripcion(proyecto.getDescripcion());
        }
        if (proyeMod.getFecha()!=null) {
            proyeMod.setFecha(proyecto.getFecha());
        }
        if (proyeMod.getLink()!=null) {
            proyeMod.setLink(proyecto.getLink());
        }
        if (proyeMod.getLinkImagen()!=null) {
            proyeMod.setLinkImagen(proyecto.getLinkImagen());
        }
        if (proyeMod.getName()!=null) {
            proyeMod.setName(proyecto.getName());
        }
        proyeRepo.save(proyeMod);
    }

    @Override
    public void eliminarProyecto(long id) {
        proyeRepo.deleteById(id);
    }

    @Override
    public void agregarProyecto(proyectoModel proyecto) {
        proyeRepo.save(proyecto);
    }
}
