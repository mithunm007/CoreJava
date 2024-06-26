package com.assignment2;

public class CommissionMain {

	public static void main(String[] args) {
		
		//Creating object by name com
		
		Commission com = new Commission();
		com.employee_Details();
		double commission = com.calculate_commission();
		System.out.println("Commission is: "+commission);
		

	}

}
