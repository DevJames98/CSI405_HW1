package com.ualbany.hw1.problem1;

public class EmployeeTest {

	//Create two employees
	private static Employee Jack = new Employee("Jack","Wesley", 257.68);
	private static Employee Jill = new Employee("Jill", "Jones", 0.0);
	
	//Calculate Yearly Salary
	public static double calculateSalary(Employee e) {
		
		//Gets the monthly salary
		double monSal = e.getMonthlySalary();
		//Calculates Yearly Salary
		double yearSal = monSal * 12.00;
		
		return yearSal;
		//Print out Salary
		//System.out.println(e.getFirstName() + "'s Yearly Salary: " + yearSal);
		
	}
	
	//Raise Salary
	public static double raiseSalary(Employee e) {
		
		//Gets the yearly salary
		double yearSal = calculateSalary(e);
		//Raise yearly salary by 10%
		yearSal = (yearSal * 0.1) + yearSal;
		
		return yearSal;
		
	}
	
	//Main Method
	public static void main(String[] args) {
		
		//Jack
		//Display Jack's Yearly Salary
		System.out.println(Jack.getFirstName() + "'s Yearly Salary: $" + calculateSalary(Jack));
		//Raise Jack's Salary + Display New Salary
		System.out.println(Jack.getFirstName() + "'s New Yearly Salary: $" + raiseSalary(Jack));
		
		System.out.println();
		
		//Jill
		//Display Jill's Yearly Salary
		System.out.println(Jill.getFirstName() + "'s Yearly Salary: $" + calculateSalary(Jill));
		//Raise Jill's Salary + Display New Salary
		System.out.println(Jill.getFirstName() + "'s New Yearly Salary: $" + raiseSalary(Jill));
	
		
	}
	
	
}
