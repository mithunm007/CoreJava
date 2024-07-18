package com.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Laptop>laps=new ArrayList<Laptop>();// created laps object of type Laptop
		laps.add(new Laptop("dell",50,3887));
		laps.add(new Laptop("asus",40,3777));
		Collections.sort(laps);
		for (Laptop l:laps) {
			System.out.println(l);
		}
		

	}

}
