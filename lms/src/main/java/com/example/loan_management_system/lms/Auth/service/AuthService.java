package com.example.loan_management_system.lms.Auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan_management_system.lms.Auth.model.User;
import com.example.loan_management_system.lms.Auth.repository.UserRepository;

@Service
public class AuthService {

  @Autowired
  private UserRepository userRepository;

  public User registerUser(User user) {
    return userRepository.save(user);
  }
}
