package com.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.model.User;

public interface RegistrationRepository extends MongoRepository<User,String> {

	public User findByEmail(String email);
	
	public User findByEmailAndPassword(String email,String password);

	
	


	

}
