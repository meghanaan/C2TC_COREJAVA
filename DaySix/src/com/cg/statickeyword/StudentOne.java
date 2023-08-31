package com.cg.statickeyword;

public class StudentOne {
	int id;
	static String college = "GEC";
	
	static void display() {
		System.out.println(college);
	}
	public static void main(String[] args) {
		display();
	}
}
