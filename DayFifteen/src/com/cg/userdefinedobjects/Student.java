//Demonstration using comparable interface
package com.cg.userdefinedobjects;

public class Student implements Comparable<Student> {
	
	private int rollno;
	private String name;
	private float per;
	
	
	public Student() {
		super();
	}
	
	public Student(int rollno, String name, float per) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		//return (int) (this.per-o.per);//ascending order
		//return (int) (o.per-this.per); //descending order
		//return this.name.compareTo(o.name);
		return o.name.compareTo(this.name);

	}
	
	
}
