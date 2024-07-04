package com.assignment4;

public interface Flipkart {
	
	void welcome();
	void thankyou();
	
	static int servicecharge() {
		int amt=9998;
		System.out.println("amount of camera is:"+amt);
		return amt;
	}
	
	static void aboutus() {
		
		System.out.println("flipkart ecomm website");
	}

}
