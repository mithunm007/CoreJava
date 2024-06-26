package com.assignment2;
import java.util.Scanner;

public class Airlines {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter customer name: ");
		String name=ob.nextLine();
		
		System.out.println("Enter source: ");
		String source=ob.nextLine();
		
		System.out.println("Enter destination: ");
		String destination=ob.nextLine();
		
		System.out.println("Dear "+name+ " welcome onboard with service from "+source+" to "+destination+". Thank you for\r\n"
				+ "choosing Sky Airlines. Enjoy your flight");

	}

}
