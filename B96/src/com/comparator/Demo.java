package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>st=new ArrayList<Student>();
		st.add(new Student(22,"zubu","blore"));
		st.add(new Student(28,"zubuuuuu","bore"));
		st.add(new Student(21,"zub","blor"));
		Collections.sort(st,new SortRoll());
		for (int i=0;i<st.size();i++) {
			System.out.println(st.get(i));
		}



	}

}
