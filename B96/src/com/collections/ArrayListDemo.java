package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList ob=new ArrayList();
//		System.out.println("size of array:"+ob.size());
//		ob.add(2);
//		ob.add("me");
//		System.out.println("the elemnts are :"+ob);
//		System.out.println("size of array:"+ob.size());
//		System.out.println("contains:"+ob.contains(2));
//		System.out.println("remove:"+ob.remove(0));
//		System.out.println("the elemnts are :"+ob);
		
		ArrayList <String>ob=new ArrayList<String>();
		ob.add("mithun");
		ob.add("Bangalore person");
		System.out.println("the elemnts are :"+ob);
		Collections.sort(ob);
		System.out.println("the elemnts are :"+ob);
		
		Iterator<String> i= ob.iterator();
		while (i.hasNext()){
			String nm=i.next();
			System.out.println("the elemnts are :"+nm);
			
			
		}
		

	}

}
