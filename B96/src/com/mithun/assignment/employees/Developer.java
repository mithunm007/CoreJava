package com.mithun.assignment.employees;

public class Developer extends Employee {
	private String Gcardname;
	private int Exp;
	private String Plang;
	
	//getters and setters 
	
	public String getGcardname() {
		return Gcardname;
	}
	public void setGcardname(String gcardname) {
		Gcardname = gcardname;
	}
	public int getExp() {
		return Exp;
	}
	public void setExp(int exp) {
		Exp = exp;
	}
	public String getPlang() {
		return Plang;
	}
	public void setPlang(String plang) {
		Plang = plang;
	}
	//tostring methods
	
	@Override
	public String toString() {
		return "Developer [Gcardname=" + Gcardname + ", Exp=" + Exp + ", Plang=" + Plang + ", getName()=" + getName()
				+ ", getEmpid()=" + getEmpid() + ", getSalary()=" + getSalary() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
	
	
	
	


	

}
