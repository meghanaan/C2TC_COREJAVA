package com.cg.wrapperclass;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unboxing converting object into primitive
		Integer j = new Integer(10);// crossing line older version //Wrapper or object type
		int k = j.intValue();
		
		//Autoboxing - primitive to object
		int i=10;//Primitive type
		Integer a = new Integer(10);
		Integer b = i;
		System.out.println(args[0]);
	}

}
