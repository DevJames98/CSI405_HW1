package com.ualbany.hw1.problem3;

public class CheckingBankAccount {

	static double value;
	static double calc;
	
	public CheckingBankAccount(double initDeposit) {
		
		value = initDeposit;
		
		
	}
	
	public double getValue() {
		
		return value;
		
	}
	
	public static void setValue(double v) {
		
		value = v; 
		
	}
	
	
	
	
	
	public static void withdraw(double money) {
		
		//If you're trying to withdraw more money that is in the account
		if(money > value) {
			
			System.out.println("Invalid transaction.");
			
		}
		else {
			
			calc = value - money;
			setValue(calc);
			
		}
		
		
	}
	
	
	public static void deposit(double money) {
		
		calc = value + money;
		setValue(calc);
		
		
	}
	
	
	
}
