package com.cg.exceptionhandling;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 0;
		System.out.println("Arithmetic exception");
		int z;
		try {
			z = x/y;
			System.out.println(z);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured");
		}
		//System.out.println("Arithmetic exception");
		
	}

}





/*
 public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first line");
		System.out.println("Second line");
		try{
	
			int[] myIntArray = new int[] {1, 2, 3};
			print(myIntArray);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("there is no index");
		}
		System.out.println("third line");
		
		
	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
		System.out.println("fourth element");
	}

}
output:
first line
Second line
there is no index
third line
 */
