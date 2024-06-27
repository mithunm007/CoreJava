package com.InheritanceProgram;

public class Student extends Customer{
	      private String collegename;
	      private int rollno;
	      
	     //default constructor 
		public Student() {
			super();
		}

		public Student(String name, int id,long adharno, long phoneno,String collegename,int rollno) {
			super(name,id,adharno,phoneno);
			this.collegename = collegename;
			this.rollno = rollno;
			
		}

		public String getCollegename() {
			return collegename;
		}

		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		@Override
		public String toString() {
			return "Student [collegename=" + collegename + ", rollno=" + rollno + ", getName()=" + getName()
					+ ", getId()=" + getId() + ", getAdharno()=" + getAdharno() + ", getPhoneno()=" + getPhoneno()
					+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ "]";
		}
		
	      
		                   
		
	      

}
          