package com.generics;

public class Demo {
	
	public static void main(String[] args) {

	Generic<String>stringobj=new Generic<>();
	stringobj.setData("Hello");
	System.out.println(stringobj);
	
	Generic<Integer>intobj=new Generic<>();
	intobj.setData(22);
	System.out.println(intobj);
	
	Generic<Double>fobj=new Generic<>();
	fobj.setData(22.1245);
	System.out.println(fobj);
}
}
