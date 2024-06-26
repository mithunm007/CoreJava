package com.mithun.assignment.employees;

public class Employee {
	
	// creating variables
	
		private String Name;
		private String Empid;
		private int Salary;
		
		// displaying the details
		
		void show() {
			System.out.println("Name:"+Name+"\t Id:"+empid+ "\t Salary:"+Salary);
		}
		
		//getters and setters

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getEmpid() {
			return Empid;
		}

		public void setEmpid(String empid) {
			Empid = empid;
		}

		public int getSalary() {
			return Salary;
		}

		public void setSalary(int salary) {
			Salary = salary;
		}
		
		//tostring method

		@Override
		public String toString() {
			return "Employee [Name=" + Name + ", Empid=" + Empid + ", Salary=" + Salary + "]";
		}
		
		

		
}
