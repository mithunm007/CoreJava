package com.threads;

public class secondway implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secondway t=new secondway();
		Thread thread =new Thread(t);
		thread.start();//runnable
		//thread.start();//illegal thread state exception
		thread.run();// act as normal method
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("creation of thread by extending thread class");
	}

}
