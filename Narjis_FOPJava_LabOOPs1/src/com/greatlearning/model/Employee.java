package com.greatlearning.model;

public class Employee {
	
	private String firstName;
	private String lastName;

//Default Constructor
public Employee() {
	
	this.firstName = "Narjis";
	this.lastName = "Fathima";
	
}

//Parameterized Constructor
public Employee(String firstName, String lastName) {
	
	this.firstName = firstName;
	this.lastName = lastName;
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

	
}
