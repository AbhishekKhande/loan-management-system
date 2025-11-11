package com.example.loan_management_system.lms.Auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan_management_system.lms.Auth.model.User;
import com.example.loan_management_system.lms.Auth.service.AuthService;

@RestController
public class AuthController {

  @Autowired
  private AuthService authService;

  @PostMapping("/v1/api/auth/register")
  public User RegisterUser(@RequestBody User user) {
    return authService.registerUser(user);
  }

}
