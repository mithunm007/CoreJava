package com.abstractprograms;

public class Akash extends TaxPayer {

	public Akash(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		if (salary >= 500000) {
			return salary * 0.10;
		} else {
			return salary * 0.20;
		}

	}

}
