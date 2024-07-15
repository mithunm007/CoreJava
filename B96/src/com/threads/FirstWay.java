package com.threads;

public class FirstWay extends Thread {
	
	public void run() {
		System.out.println("creation of thread by extending thread class");
	}
	
	public static void main(String[] args) {
		
		FirstWay ob=new FirstWay();
		ob.start();
		ob.stop();
		ob.start();
	}

}
