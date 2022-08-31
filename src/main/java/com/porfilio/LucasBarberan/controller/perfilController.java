/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfilio.LucasBarberan.controller;

import com.porfilio.LucasBarberan.model.perfilModel;
import com.porfilio.LucasBarberan.service.perfilService;
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
public class perfilController {
    
    @Autowired
    private perfilService perServ;
    
    @RequestMapping(value = "perfil")
    public List<perfilModel> verPerfil(){
        return perServ.verPerfil();
    }
    
    @PostMapping("/perfil")
    public void agregarPerfil(@RequestBody perfilModel perfil){
        perServ.agregarPerfil(perfil);
    }
    @PutMapping("/perfil/{id}")
    public void modificarPerfil(@PathVariable long id, @RequestBody perfilModel perfil){
        perServ.modificarPerfil(id, perfil);
    }
    @DeleteMapping("/perfil/{id}")
    public void eliminarPerfil(@PathVariable long id){
        perServ.eliminarPerfil(id);
    }
}
