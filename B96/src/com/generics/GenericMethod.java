package com.generics;

public class GenericMethod {
	
	public <T> void displayArrayElements(T[] elements) {
		
		for(T ele:elements) {
			System.out.println("Elements is "+ele);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod ob=new GenericMethod();
		Integer[] intarry= {10,20,30};
		String[] starry= {"mithun","zubu"};
		ob.displayArrayElements(intarry);
		ob.displayArrayElements(starry);
		

	}

}
