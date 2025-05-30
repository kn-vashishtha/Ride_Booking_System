package com.abes.ridebookingsystem.dto;

//It is an abstract class and is the parent for admin, customer, and driver
public abstract class User {
	protected String userId; // unique identification
	protected String name; // user full name
	protected String email; // user email id
	protected String password;// user password

	/**
	 * Constructs a new User.
	 * 
	 * @param userId   unique identification
	 * @param name     full name of user
	 * @param email    valid email address
	 * @param password
	 */
	public User(String userId, String name, String email, String password) {
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	// Access methods (getters)

	/**
	 * @return the user's unique identifier
	 */

	public String getUserId() {
		return userId;
	}

	/**
	 * @return the user's name
	 */

	public String getName() {
		return name;
	}

	/**
	 * @return the user's email
	 */

	public String getEmail() {
		return email;
	}

	/**
	 * @return the user's password
	 */

	public String getPassword() {
		return password;
	}

	// Mutator methods (setters)

	/**
	 * Sets the user's unique identifier
	 * 
	 * @param userId new unique ID
	 */

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Sets the user's name
	 * 
	 * @param name user's new name
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the user's email
	 * 
	 * @param email user's new email
	 */

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Sets the user's password
	 * 
	 * @param password user's new password
	 */

	public void setPassword(String password) {
		this.password = password;
	}

	// overridden to string method

	@Override
	public String toString() {
		return "User{" + "userId='" + userId + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + '}';
	}
}
