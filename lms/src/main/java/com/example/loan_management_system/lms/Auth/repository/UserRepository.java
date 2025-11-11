package com.example.loan_management_system.lms.Auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan_management_system.lms.Auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
  boolean existsByEmail(String email);

  User findByEmail(String email);
}
