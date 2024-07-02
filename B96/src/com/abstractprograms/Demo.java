package com.abstractprograms;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter akash salary:");
		double akashsal=sc.nextDouble();
		TaxPayer ob=new Akash(akashsal);
		
		System.out.println("enter Hitesha salary:");
		double Hiteshasal=sc.nextDouble();
		TaxPayer ob1=new Akash(Hiteshasal);
		
		System.out.println("akash salary:");
		ob.display();
		System.out.println("Hitesha salary is:");
		ob1.display();


	}

}
