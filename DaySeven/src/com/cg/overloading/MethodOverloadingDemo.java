package com.cg.overloading;

public class MethodOverloadingDemo {
	
	//M1 - 2parameter
	public static int addition(int a, int b){
		return a+b;
	}
	//M2 - Data type of parameter and return type of parameter
	public static float addition(float a, float b){
		return a+b;
	}
	//M3 - data type in parameter
	public static float addition(int a, float b){
		return a+b;
	}
	
	//M4 - data type in parameter
	/*public static float addition(float a, int b){
		return a+b;
	}*/
	
	//M5 - data type in parameter
	/*public static int addition(float b, int a){
		return a+b;
	}*/
}
//Method overloading
//1. data type of argument alone - possible
//2. Number of argument alone - possible
//3. Data type of argument  + return type of method - possible
//4. number of argument + return type of method - possible
//5. 
