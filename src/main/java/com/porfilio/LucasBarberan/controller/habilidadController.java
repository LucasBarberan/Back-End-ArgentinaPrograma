/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfilio.LucasBarberan.controller;

import com.porfilio.LucasBarberan.model.habilidadModel;
import com.porfilio.LucasBarberan.service.habilidadService;
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
public class habilidadController {
    
    @Autowired
    private habilidadService habiServ;
    
    @RequestMapping(value = "habilidades")
    public List<habilidadModel> verHabilidades(){
        return habiServ.verHabilidades();
    }
    @PostMapping("/habilidades")
    public void agregarHabilidad(@RequestBody habilidadModel habilidad){
        habiServ.agregarHabilidad(habilidad);
    }
    @PutMapping("/habilidades/{id}")
    public void modificarHabilidad(@PathVariable long id,@RequestBody habilidadModel habilidad){
        habiServ.modificarHabilidad(id, habilidad);
        
    }
    @DeleteMapping("/habilidades/{id}")
    public void eliminarHabilidad(@PathVariable long id){
        habiServ.eliminarHabilidad(id);
    }
    
}
