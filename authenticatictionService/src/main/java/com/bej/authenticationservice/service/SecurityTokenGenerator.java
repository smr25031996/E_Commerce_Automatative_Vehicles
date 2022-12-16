package com.bej.authenticationservice.service;

import com.bej.authenticationservice.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator {

  Map<String, Object> generateToken(User user);
}
