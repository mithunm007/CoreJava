package com.generics;

import java.util.ArrayList;

public class Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new ArrayList();
		list.add("JAVA");
		list.add(123);
		for(Object obj:list) {
			String str=(String)obj;//type casting
			System.out.println(obj);
			
			
		}

	}

}
