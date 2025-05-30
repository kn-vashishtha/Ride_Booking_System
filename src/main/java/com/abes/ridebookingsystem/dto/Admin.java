package com.abes.ridebookingsystem.dto;           // Package Declaration

public class Admin extends User {                 // Admin class extends User(inheriting its fields and methods)
	private String role;                         // Additional field specific to Admin class that not present in User

	public Admin(String userId, String name, String email, String password, String role) { // Constructor
		super(userId, name, email, password);   // Call to the parent class User constructor to initialize inherited fields
		this.role = role;                       // Set Admin Role
	} 

	public String getRole() {                  //Getter method 
		return role;
	}

	public void setRole(String role) {        // Setter method 
		this.role = role;
	}

	@Override
	public String toString() {                // Overriding the toString() method
		return "Admin{" + "userId='" + userId + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' // Customize the string
				+ ", role='" + role + '\'' + '}';
	}
}
