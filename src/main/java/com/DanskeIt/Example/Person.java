package com.DanskeIt.Example;

public class Person {
	public String firstName;
	public String lastName;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	
	
}
