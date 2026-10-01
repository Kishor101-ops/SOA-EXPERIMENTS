package com.example.jwtcreation;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.security.Keys;

@Service
public class JWTService {
		String key="this is spring boot jwt creation";
		SecretKey secretkey=Keys.hmacShaKeyFor(key.getBytes());
		
}
