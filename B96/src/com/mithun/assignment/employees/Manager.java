package com.mithun.assignment.employees;

public class Manager extends Employee{
	
	private String Bacct;
	private String Teamname;
	
	//getters and setters 
	
	public String getBacct() {
		return Bacct;
	}
	public void setBacct(String bacct) {
		Bacct = bacct;
	}
	public String getTeamname() {
		return Teamname;
	}
	public void setTeamname(String teamname) {
		Teamname = teamname;
	}
	
	// tostring method
	
	@Override
	public String toString() {
		return "Manager [Bacct=" + Bacct + ", Teamname=" + Teamname + ", getName()=" + getName() + ", getEmpid()="
				+ getEmpid() + ", getSalary()=" + getSalary() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
