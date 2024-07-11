package com;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 0;
		try {
			int a = 42 / d;// exception is raised
			System.out.println("Mithun");
		} catch (ArithmeticException e) {
			System.out.println("exception handled successfully" + e.getMessage());
		}
		System.out.println("will not be printed");

	}

}
