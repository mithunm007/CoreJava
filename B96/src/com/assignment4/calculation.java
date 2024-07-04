package com.assignment4;

public class calculation implements Amazon,Flipkart {

	
	public void servicecharge() {
	
		Amazon.aboutus();
		int amazon = Amazon.servicecharge();
		//static method form flipkart
		Flipkart.aboutus();
		int flipkart = Flipkart.servicecharge();
		
		//comparing the prices of product of from amazon and flipkart
		if ( amazon < flipkart) {
			System.out.println("the best offers is from amazon: "+amazon);
		}
		else {
			System.out.println("the best offers is from flipkart: "+flipkart);
		}
		
	}

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		
	}

	@Override
	public void thankyou() {
		// TODO Auto-generated method stub
		System.out.println("thank you");
	}

	
	

}
