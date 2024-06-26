//Program to calculate the Commission

package com.assignment2;

//import Scanner
import java.util.Scanner;

public class Commission {
	
	private String Name;
	private String Adress;
	private String Phone;
	private int SalesAmount;
	private double Commission;
	
	//Method to accept the input from the user
	
	public void employee_Details() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		Name = sc.nextLine();
		System.out.println("Enter the Adress:");
		Adress = sc.nextLine();
		System.out.println("Enter the phone Number:");
		Phone = sc.next();
		System.out.println("Enter the sales Amount:");
		SalesAmount = sc.nextInt();
		sc.close();
	}
	
	//Method to calculate the Commission
	
	public double calculate_commission() {
		
		if (SalesAmount >= 100000) {
			Commission = SalesAmount + (SalesAmount * 0.1);
		}
		else if (50000 <= SalesAmount && SalesAmount < 100000) {
			Commission = SalesAmount + (SalesAmount * 0.05);
		}
		else if (30000 <= SalesAmount && SalesAmount < 50000) {
			Commission = SalesAmount + (SalesAmount * 0.03);
		}
		else {
			Commission = 0;
		}
		return Commission;
		
	}

}
