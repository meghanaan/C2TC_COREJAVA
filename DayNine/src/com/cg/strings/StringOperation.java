package com.cg.strings;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String(" indian ");
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(2, 6));
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.stripIndent());
		String s3 = "Hello";
		String s4 = "World";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		String s5 = "Hello";
		String s6 = "Hello";
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		String s7 = "Hello";
		String s8 = new String("Hello");
		System.out.println(s7==s8);
		System.out.println(s7.equals(s8));
		
	}

}
