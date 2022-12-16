package com.bej.authenticationservice.service;

import com.bej.authenticationservice.domain.User;
import com.bej.authenticationservice.repository.UserRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtSecurityTokenGeneratorImpl implements SecurityTokenGenerator {
  @Autowired
  UserRepository userRepository;


  @Override
  public Map<String, Object> generateToken(User user) {

    String jwtToken = null;

    jwtToken = Jwts.builder()
            .setSubject(user.getUsername())
            .setIssuedAt(new Date())
            .signWith(SignatureAlgorithm.HS256, "secretkey").compact();

    Map<String, Object> map = new HashMap<>();
    map.put("token", jwtToken);
    map.put("message", "User Successfully logged in");
    map.put("user", userRepository.findById(user.getUsername()));
    return map;
  }
}

