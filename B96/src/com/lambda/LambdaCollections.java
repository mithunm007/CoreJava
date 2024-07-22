package com.lambda;

import java.util.ArrayList;

public class LambdaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li=new ArrayList<>();
		li.add(33);
		li.add(76);
		li.add(34);
		li.forEach(e->System.out.println(e));
	}

}
