package com.cg.strings;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("Hello");
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.capacity());//default capacity value is 16
		System.out.println(buffer);
		System.out.println(buffer.length());//5
		System.out.println(buffer.capacity());//21
		StringBuffer s2 = new StringBuffer(100);
		System.out.println(s2.capacity());//100
	}
//Empty constructor will take the capacity of default 16
//Constructor with string value will take the capacity of 16 + length of input
//Constructor with in value will take the capacity of exact input value
}
