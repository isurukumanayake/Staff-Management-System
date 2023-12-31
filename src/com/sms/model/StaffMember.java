package com.sms.model;

public class StaffMember extends Person {
	
	private int staffMemberID;
	private String position;
	private double salary;
	private String username;
	private String password;
	

	//default constructor
	public StaffMember() {
		super();
	}
	
	//overloaded constructor
	public StaffMember(int staffMemberID, String firstName, String lastName, String email, String contactNo, String position, double salary, String username, String password) {
		super(firstName, lastName, email, contactNo);
		this.staffMemberID = staffMemberID;
		this.position = position;
		this.salary = salary;
		this.username = username;
		this.password = password;
	}

	
	//getters
	public int getStaffMemberID() {
		return staffMemberID;
	}

	public String getPosition() {
		return position;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public String getPassword() {
		return password;
	}
	
	
	//setters
	public void setStaffMemberID(int staffMemberID) {
		this.staffMemberID = staffMemberID;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
