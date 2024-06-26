package com.class2_Constructors;

public class Customer {
	
	private int id;
	private String Name;
	
	public Customer() {
		super();
		System.out.println("---default constructor---");
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", Name=" + Name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
	
	

}
