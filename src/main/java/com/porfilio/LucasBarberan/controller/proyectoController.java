/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfilio.LucasBarberan.controller;

import com.porfilio.LucasBarberan.model.habilidadModel;
import com.porfilio.LucasBarberan.model.proyectoModel;
import com.porfilio.LucasBarberan.service.proyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lucas
 */
@RestController
public class proyectoController {
    
    @Autowired
    private proyectoService proyeServ;
    
    @RequestMapping(value = "proyectos")
    public List<proyectoModel> verProyecto(){
        return proyeServ.verProyecto();
    }
    
    @PostMapping("/proyectos")
    public void agregarProyecto(@RequestBody proyectoModel proyecto){
        proyeServ.agregarProyecto(proyecto);
    }
    
    @PutMapping("/proyectos/{id}")
    public void modificarProyecto(@PathVariable long id,@RequestBody proyectoModel proyecto){
        proyeServ.modificarProyecto(id, proyecto);
    }
    
    @DeleteMapping("/proyectos/{id}")
    public void eliminarProyecto(@PathVariable Long id){
        proyeServ.eliminarProyecto(id);
    }
    
    
            
}
