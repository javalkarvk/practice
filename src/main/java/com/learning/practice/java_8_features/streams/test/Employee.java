package com.learning.practice.java_8_features.streams.test;

public class Employee {
	int id;
	String firstname;
	String lastname;
	
	public Employee (int id, String fName, String lastName) {
		this.id = id;
		this.firstname = fName;
		this.lastname = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String toString() {
		return this.firstname + this.lastname;
	}
}
