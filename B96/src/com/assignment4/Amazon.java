package com.assignment4;

public interface Amazon {
	//abstract methods
		void welcome();
		void thankyou();
		
		static int servicecharge() {
			int amt=10000;
			System.out.println("amount of camera is:"+amt);
			return amt;
		}
		
		static void aboutus() {
			
			System.out.println("Amazon ecomm website");
		}
		

}
