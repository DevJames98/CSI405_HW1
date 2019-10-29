package com.ualbany.hw1.problem3;

//ASSOCIATED CLASS w/ CheckingBankAccount = "has-a" relationship
public class Bank {

	String name;
	Address address;
	
	
	public Bank(String n, Address a) {
		
		name = n;
		address = a;
		
		
	}
	public String getBankName() {
		
		return name;
		
	}
	
	
	public void setBankName(String l) {
		
		name = l;
		
	}
	public Address getBankAddress() {
		
		return address;
		
	}
	
	
	public void setBankAddress(Address l) {
		
		address = l;
		
	}
	
	
	
	public static void main(String[] args) {
		
		//Initial deposit of $1000
		CheckingBankAccount johnCheck = new CheckingBankAccount(1000.00);
		Address bankAddress = new Address("31 Sample Street", "", "Albany", "NY", "11212" );
		Address johnAddress = new Address("21 Savage Avenue", "", "Atlanta", "GA", "21212");
		Person John = new Person("John", "Charles", johnAddress, johnCheck);
		
		Bank Chase = new Bank("Chase" , bankAddress);
		
		//Simulate bank arrival
		System.out.println("Hello " + John.getFirstName() + "! Welcome to "+ Chase.getBankName() +"!");
		
		//Simulate initial deposit
		System.out.println("Completed transaction. Here's your receipt:");
		System.out.println(John.getFirstName() + "\n" + John.getAddress() + "\n" + johnCheck.getValue());
		
		
	}
	
	
	
	
}
