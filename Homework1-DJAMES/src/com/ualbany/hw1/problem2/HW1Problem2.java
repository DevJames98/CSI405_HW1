package com.ualbany.hw1.problem2;

public class HW1Problem2 {

	
	//Method 1
	public boolean multiple(int a, int b) {
		
		//If the remainder is not equal to 0
		if((a % b) != 0) {
			
			return false;
			
		}
		//If they are equally divisible
		else {
			
			return true;
			
		}
		
		
	}
	
	
	//Method 2
	public double reminder(int x) {
		
		return x % 7;
		
	}
	
	
	//Method 3
	public double calculateDistance(double x1, double y1, double x2, double y2) {
		
		//Calculate Distance (broken down in two parts)
		//(x2 - x1)^2
		double part1 = Math.pow((x2 - x1), 2);
		//(y2 - y1)^2
		double part2 = Math.pow((y2 - y1), 2);
		
		//Returns completed distance formula (square root of the two previously calculated sums)
		return Math.sqrt((part1 + part2));
		
	}
	
	
	//Bonus Method
	
	
	
	
	
	
}
