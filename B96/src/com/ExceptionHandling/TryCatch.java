//program demo for multiple catch
package com.ExceptionHandling;

public class TryCatch {
	public static void divide() {
		int a = 6, b = 0, c;
		try {
			c = a / b;

		} catch (ArithmeticException e) {
			System.out.println("will not  printed" + e.getMessage());
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("will not be rinted" + e.getMessage());
		} catch (Exception e) {
			System.out.println("will  be printed" + e.getMessage());
		}

	}

}
