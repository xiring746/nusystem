package com.springbootlogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.springbootlogin.model.User;
import com.springbootlogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
       
	User save(UserRegistrationDto registrationDto);
	
}
