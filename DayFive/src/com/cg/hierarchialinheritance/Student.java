package com.cg.hierarchialinheritance;

public class Student extends Person {
	
	private String department;
	private float cgpa;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		this.department=department;
		this.cgpa=cgpa;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [department=" + department + ", cgpa=" + cgpa + ", getName()=" + getName() + ", getGender()="
				+ getGender() + ", getPhoneNo()=" + getPhoneNo() + ", getCity()=" + getCity() + "]";
	}
	
	
}
