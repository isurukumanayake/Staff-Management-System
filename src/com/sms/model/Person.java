package com.sms.model;

public abstract class Person {

	private String firstName;
	private String lastName;
	private String email;
	private String contactNo;

	
	//default constructor
	public Person() {
		super();
	}
	
	//overloaded constructor
	public Person(String firstName, String lastName, String email, String contactNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
	}


	//getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getContactNo() {
		return contactNo;
	}

	
	//setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}	
	
	
	//abstract methods
	public abstract String getUsername();
	
	public abstract String getPassword();
}
