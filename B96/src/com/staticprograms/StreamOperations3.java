package com.staticprograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperations3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] values=new Integer[] {10,20,30,40};//input from arrays
		Stream<Integer>ob= Arrays.stream(values);
		
		//System.out.println("Square of number:"+Arrays.toString(values));
		Arrays.stream(values).skip(20).forEach(System.out::println);

	}

}
