/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfilio.LucasBarberan;

import com.porfilio.LucasBarberan.repository.loginRepository;
import com.porfilio.LucasBarberan.security.jwt.JwtTokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 *
 * @author lucas
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class AplicationSecurityConfing extends WebSecurityConfigurerAdapter {
    @Autowired
    private loginRepository userRepo;
    @Autowired
    private JwtTokenFilter jwtTokenFilter;

     @Bean
     PasswordEncoder passwordEncoder()
     {
         return new BCryptPasswordEncoder();
     }
     @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
         auth.userDetailsService(username -> userRepo.findByEmail(username)
                 .orElseThrow(()-> new UsernameNotFoundException("No user"))
         );
     }

     @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception{
         return super.authenticationManagerBean();
     }

     @Override
    protected AuthenticationManager authenticationManager() throws Exception
     {
         return super.authenticationManager();
     }

     @Override
    protected void configure(HttpSecurity http) throws Exception
     {
         http.csrf().disable()
                 .authorizeRequests().antMatchers("/**")
                 .permitAll()
                 .anyRequest()
                 .authenticated()
                 .and()
                 .httpBasic()
                 .and()
                 .cors();
         http.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
     }

}
