package com.cg.lambdaexpression;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inf1 obj = () ->{
			System.out.println("I am a display method");
			System.out.println("I am a method in a functional interface");
		};
		obj.display();
	}

}
