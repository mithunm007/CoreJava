//Learning use cases of static

package com.staticprograms;


public class Student {
	
	//instance variables
	private String name;
	private int id;
	
	//static variable
	static String collageName="DBIT";

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
	
	
	

}
