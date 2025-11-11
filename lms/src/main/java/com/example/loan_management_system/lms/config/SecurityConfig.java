package com.example.loan_management_system.lms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .csrf(csrf -> csrf.disable()) // disable CSRF for testing
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/v1/api/auth/register", "/v1/api/auth/login").permitAll() // public endpoints
            .anyRequest().authenticated() // secure everything else
        );

    return http.build();
  }
}
