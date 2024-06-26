package com.mithun.assignment.utilities;
import com.mithun.assignment.employees.*; //importing details from employees package

public class EmployeeUtilities {
	
	public void manager_details(String Name, String Empid, int Salary, String Bacct,  String Teamname) {
		
		Manager man = new Manager();
		man.setEmpid(Empid);
		man.setName(Name);
		man.setSalary(Salary);
		man.setBacct(Bacct);
		man.setTeamname(Teamname);
		System.out.println(man);	
	}

	public void developer_details(String Name, String Empid, int Salary, int Exp, String Plang,String Gcardname) {
		Developer dev = new Developer();
		dev.setEmpid(Empid);
		dev.setName(Name);
		dev.setSalary(Salary);
		dev.setPlang(Plang);
		dev.setExp(Exp);
		dev.setGcardname(Gcardname);
		System.out.println(dev);
	}
}

