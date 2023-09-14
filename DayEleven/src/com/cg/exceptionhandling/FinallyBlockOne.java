package com.cg.exceptionhandling;

public class FinallyBlockOne {
	
	public static void divide(int a, int b) {
		try {
			System.out.println("Within try block");
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception caught: "+ e.getMessage());
		}
		finally {
			System.out.println("In finally block");
		}
	}
}
