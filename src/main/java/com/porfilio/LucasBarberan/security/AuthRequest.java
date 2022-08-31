/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfilio.LucasBarberan.security;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;

/**
 *
 * @author lucas
 */
@Getter @Setter
public class AuthRequest {
    @Email
    @Length(min=5, max=50)
    private String email;
    
    @Length(min=8, max=50)
    private String password;
}
