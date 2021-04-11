package com.project.modal;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Booking")
public class Booking {
	
	@Id
	private String Id;
	private String firstName;
	private String lastName;
	private int age;
	
	
	
	public Booking() {
		super();
	}
	
	public Booking(String Id, String firstName, String lastName, int age) {
		super();
		this.Id = Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
