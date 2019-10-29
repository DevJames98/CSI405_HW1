package com.ualbany.hw1.problem3;

public class Address {
	
	String line1;
	String line2;
	String city;
	String state;
	String zip;
	String address;
	
	
	
	public Address(String l1, String l2, String c, String s, String z) {
		
		//Create instance variables
		line1 = l1;
		line2 = l2;
		city = c;
		state = s;
		zip = z;
		
		
		
	}
	
	
	/*
	 * GETTERS AND SETTERS
	 */
	
	public String getLine1() {
		
		return line1;
		
	}
	
	
	public void setLine1(String l) {
		
		line1 = l;
		
	}
	
	public String getLine2() {
		
		return line2;
		
	}
	
	
	public void setLine2(String l) {
		
		line2 = l;
		
	}
	
	public String getCity() {
		
		return city;
		
	}
	
	
	public void setCity(String l) {
		
		city = l;
		
	}
	
	public String getState() {
		
		return state;
		
	}
	
	
	public void setState(String l) {
		
		state = l;
		
	}
	
	
	public String getZip() {
		
		return zip;
		
	}
	
	
	public void setZip(String l) {
		
		zip = l;
		
	}
	
	//Combines address parts into one string
	public String getAddress() {
		
		address = line1 + "\n" + line2 + "\n" + city + ", " + state + " " + zip;
		return address;
		
	}
	
	
}
