package com.ualbany.hw1.problem3;

public class Person {

	String firstName;
	String lastName;
	Address address;
	CheckingBankAccount check;
	
	
	public Person(String fname, String lname, Address a, CheckingBankAccount cba) {
		
		firstName = fname;
		lastName = lname;
		address = a;
		check = cba;
		
		
		
	}
	
	public String getFirstName() {
		
		return firstName;
		
	}
	
	
	public void setFirstName(String l) {
		
		firstName = l;
		
	}
	public String getLastName() {
		
		return lastName;
		
	}
	
	
	public void setLastName(String l) {
		
		firstName = l;
		
	}
	public Address getAddress() {
		
		return address;
		
	}
	
	
	public void setAddress(Address l) {
		
		address = l;
		
	}
	public CheckingBankAccount getChecking() {
		
		return check;
		
	}
	
	
	public void setChecking(CheckingBankAccount l) {
		
		check = l;
		
	}
	
	
}
