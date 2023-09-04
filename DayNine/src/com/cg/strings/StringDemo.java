package com.cg.strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String literal / new keyword
		String str =new String("Study");
		String str1 = str.concat("Night");// concatenation
		System.out.println(str1);
		
		//Stringbuilder
		
		String str2 = "Study";
		str2.concat("Night");// concatenation
		System.out.println(str2);
		
		StringBuffer s1 = new StringBuffer("Study");
		s1.append("Night");
		System.out.println(s1);
	}

}
