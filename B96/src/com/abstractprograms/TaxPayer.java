package com.abstractprograms;

public abstract class TaxPayer {
	protected double salary;// instance variable

	// parameterized constructor
	public TaxPayer(double salary) {
		super();
		this.salary = salary;
	}

	// abstract method
	public abstract double calTax();

	// non abstract method
	public void display() {
		System.out.println("tax paid is:" + calTax());

	}

}
