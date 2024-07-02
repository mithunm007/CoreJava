package com.abstractprograms;

public class Hitesha extends TaxPayer{

	public Hitesha(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		return salary*0.15;
	}
	
	

}
