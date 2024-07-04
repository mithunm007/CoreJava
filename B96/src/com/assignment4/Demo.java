package com.assignment4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon ob = new calculation(); //can use flipkart also...
		
		//object of class Offers
		calculation offer = new calculation();
		
		//welcome message inherited from the interfaces
		ob.welcome();
		//calculating the best offer in the offers class
		offer.servicecharge();
		//thank you message inherited from the interfaces
		ob.thankyou();

	}

}
