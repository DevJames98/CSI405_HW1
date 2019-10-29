package com.ualbany.hw1.problem1;

public class Employee {
	
	//Create global variables
	String firstName;
	String lastName;
	double monthlySalary;
	
	//Create constructor to instantiate variables
	public Employee(String f, String l, double m) {
		
		//Create instance variables
		firstName = f;
		lastName = l;
		monthlySalary = m;
	}
	
	/*
	 * GETTERS AND SETTERS
	 */
	
	//Get firstName
	public String getFirstName() {
		
		return firstName;
		
	}
	
	
	//Set firstName
	public void setFirstName(String f) {
		
		firstName = f;
		
	}
	
	
	//Get lastName
	public String getLastName() {
			
			return lastName;
			
		}
	
	
	//Set lastName
	public void setLastName(String l) {
			
			lastName = l;
			
		}
	
	
	//Get monthlySalary
	public double getMonthlySalary() {
		
		
		return monthlySalary;
		
	}
	
	
	//Set monthlySalary
	public void setMonthlySalary(double m) {
		
		double checkSalary = m;
		
		//Checks if salary is a positive number before setting
		if(checkSalary < 0.0) {
			
			monthlySalary = 0.0;
			
		}
		else {
			
			monthlySalary = m;
			
		}
		
	}
	
	
	
}
