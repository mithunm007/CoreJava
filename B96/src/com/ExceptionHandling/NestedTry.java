package com.ExceptionHandling;

public class NestedTry {
	public static void check() {
		int arr[] = null;
		int y = 6;

		String str = "tns";
		try {
			int z = y / 0;
			try {
				System.out.println(arr[0]);
				System.out.println(str.charAt(y));
			} catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("will not be printed" + e.getMessage());
			} catch (NullPointerException e) {

				System.out.println("will be printed" + e.getMessage());
			}
		} catch (ArithmeticException e) {

			System.out.println("printed" + e.getMessage());
		}

	}
}
