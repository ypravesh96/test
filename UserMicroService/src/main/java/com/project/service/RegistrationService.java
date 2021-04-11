package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.User;
import com.project.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;

	public User saveUser(User user) {
		
		return registrationRepository.save(user);
	}

	public User getUserByEmail(String email) {
		return registrationRepository.findByEmail(email);
	}

	public List<User> showUser() {
		
		return registrationRepository.findAll() ;
	}
	
	public User fetchUserByEmailAndPassword(String email,String password) {
		return registrationRepository.findByEmailAndPassword(email, password);
		
	}
	

}
