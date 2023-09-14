package com.cg.generic;

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericClass<Integer> gc = new GenericClass<Integer>();
		gc.set(10);
		System.out.println(gc.get()); 
		
		GenericClass<Double> gcOne = new GenericClass<Double>();
		gcOne.set(10.00);
		System.out.println(gcOne.get()); 
		
		GenericClass<String> gcnxt = new GenericClass<String>();
		gcnxt.set("1");
		System.out.println(gcnxt.get());
	}

}
