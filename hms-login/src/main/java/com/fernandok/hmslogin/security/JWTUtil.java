package com.fernandok.hmslogin.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class JWTUtil {

    @Value("teste")
    private String secret;

    @Value("600000")
    private Long expiration;

    public String generateToken(String login) {
        return Jwts.builder()
                .claim("Login", login)
                .setSubject(login)
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(SignatureAlgorithm.HS512, secret.getBytes())
                .compact();
    }
}
