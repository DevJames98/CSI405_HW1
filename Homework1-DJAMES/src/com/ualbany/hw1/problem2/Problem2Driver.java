package com.ualbany.hw1.problem2;
import java.util.*;


public class Problem2Driver {

	
	
	public static void main(String[] args) {
		
		//Create instance of HW1 class
		HW1Problem2 hw = new HW1Problem2();
		
		//Multiple
		Scanner scan = new Scanner(System.in);
		System.out.println("**MULTIPLE METHOD**");
		//Ask for user input
		System.out.println("Enter the first integer");
		int a = scan.nextInt();
		System.out.println("Enter the second integer");
		int b = scan.nextInt();
		
		//Print response
		System.out.println(hw.multiple(a,b));
		
		
		//Reminder
		System.out.println("**REMINDER METHOD**");
		//Ask for user input
		System.out.println("Enter an integer");
		int c = scan.nextInt();
		double remainder = hw.reminder(c);
		//Print response
		System.out.println("The remainder of " + c + " divided by 7 is :" + remainder);
		
		
		
		//Distance
		System.out.println("**DISTANCE METHOD**");
		//Ask for user input
		System.out.println("Enter x1");
		double x1 = scan.nextDouble();
		System.out.println("Enter y1");
		double y1 = scan.nextDouble();
		System.out.println("Enter x2");
		double x2 = scan.nextDouble();
		System.out.println("Enter y2");
		double y2 = scan.nextDouble();
		
		//Calculate distance
		double distance = hw.calculateDistance(x1,y1,x2,y2);
		//Print response
		System.out.println("Distance between points: " + distance);
		
		//Close scanner
		scan.close();
		
		
		
		
	}
	
	
	
	
}
