/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfilio.LucasBarberan.repository;

import com.porfilio.LucasBarberan.model.usuarioModel;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lucas
 */
public interface loginRepository extends JpaRepository<usuarioModel, Long>
{
     Optional<usuarioModel> findByEmail(String email);

}
