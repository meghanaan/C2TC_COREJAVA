package com.cg.lambdaexpression;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = (int a, int b) ->(a+b);{System.out.println(add.add(10, 20));};
	}

}
