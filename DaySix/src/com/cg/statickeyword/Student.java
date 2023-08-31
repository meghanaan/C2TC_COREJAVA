package com.cg.statickeyword;

public class Student {
	
	private int id;
	private String name;
	private String department = "ECE";
	private String batchNo = "B70";
	private String collegeName = "GEC";
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id + " " + name + " " + department);
	}
		
	
}
