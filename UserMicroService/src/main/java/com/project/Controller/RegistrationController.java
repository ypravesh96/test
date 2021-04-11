package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.User;
import com.project.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService; 
	
	@PostMapping("/register")
	@CrossOrigin(origins="http://localhost:4200")
	public User save(@RequestBody User user) throws Exception {
		String tempemail= user.getEmail();
		if(tempemail != null) {
			
			User userObj=registrationService.getUserByEmail(tempemail);
			if(userObj !=null) {
				throw new Exception("user with "+tempemail+" is already exist");
			}
		}
		User userObj=null;
		userObj= registrationService.saveUser(user);
		return userObj;
		
	}
	
	
	
	@GetMapping("/showUser")
	public List<User> showUser(){
		
		return registrationService.showUser();
	}
	
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public User LoginUser(@RequestBody User user) throws Exception {
		
		String tempEmail=user.getEmail();
		String tempPassword=user.getPassword();
		User userObj=null;
		if(tempEmail !=null && tempPassword != null) {
			userObj=registrationService.fetchUserByEmailAndPassword(tempEmail,tempPassword);
		}
		if(userObj==null) {
			throw new Exception("Bad Credential");
		}
		return userObj;
		
	}
	
}
