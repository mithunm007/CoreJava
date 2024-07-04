package com.Interfaceprgms;

public interface Amazon {
	
	//abstract methods
	void welcome();
	void thankyou();
	
	default void servicecharge() {
		int amt=1000;
		System.out.println("amount is:"+amt);
	}
	
	static void aboutus() {
		
		System.out.println("ecomm website");
	}
	

}
