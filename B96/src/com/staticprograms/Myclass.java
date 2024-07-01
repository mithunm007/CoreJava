package com.staticprograms;

public class Myclass {
	private int section;
	static int srNo;
	
	static {
		System.out.println("-----static block-------");
		srNo=1000;
		
	}

	public Myclass() {
		super();
		System.out.println("-----default constructor-------");
	}
	
	static void display() {
		System.out.println("-----static method-------");
		System.out.println("---the serial no is ---"+srNo);
	}

	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	
	
	
	
	

}
