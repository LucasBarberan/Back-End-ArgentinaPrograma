/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfilio.LucasBarberan.controller;

import com.porfilio.LucasBarberan.model.educacionModel;
import com.porfilio.LucasBarberan.service.educacionService;
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
public class educacionController {

   @Autowired
   private educacionService eduServ;
   
   @RequestMapping(value = "educacion")
   public List<educacionModel> verEducacion(){
       return eduServ.verEducaciones();
   }
   @PostMapping("/educacion")
   public void agregarEducacion(@RequestBody educacionModel educacion){
       eduServ.agregarEducacion(educacion);
   }
   @PutMapping("/educacion/{id}")
   public void modificarEducacion(@PathVariable long id,@RequestBody educacionModel educacion){
       eduServ.modificarEducacion(id, educacion);
   }
   @DeleteMapping("/educacion/{id}")
   public void eliminarEducacion(@PathVariable long id){
       eduServ.eliminarEducacion(id);
   }
   
   
}
