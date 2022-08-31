/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfilio.LucasBarberan.security.jwt;

import com.porfilio.LucasBarberan.model.usuarioModel;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author lucas
 */
@Component
public class JwtTokenUtil {
    private static final Logger LOGGER= LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final long EXPIRE_DURATION=24*3600*1000;

    @Value("${jwt.secret}")
    private String secretKey;

    public String generateAccessToken(usuarioModel user)
    {
        return Jwts.builder().setSubject(user.getId() + "," +user.getEmail())
                .setIssuer("CodeJava")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();

    }

    public boolean validateAccessToken(String token)
    {
        try
        {
            Jwts.parser().setSigningKey(secretKey).parseClaimsJwt(token);
            return true;
        }
        catch (ExpiredJwtException ex)
        {
            LOGGER.error("JWT Expired",ex);
        }
        catch (MalformedJwtException ex)
        {
            LOGGER.error("JWT is invalid",ex);
        }
        catch (IllegalArgumentException ex)
        {
            LOGGER.error("Token is null, empty or has only whitespaces");
        }
        catch (UnsupportedJwtException ex)
        {
            LOGGER.error("JWT is not suported",ex);
        }
        catch (SignatureException ex)
        {
            LOGGER.error("Signature validation failed",ex);
        }
        return false;
    }

    public String getSubject(String token)
    {
        return parseClaims(token).getSubject();
    }

    private Claims parseClaims(String token)
    {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJwt(token)
                .getBody();
    }

}
