package com.cg.hierarchialinheritance;

public class Employee extends Person {
	
	private int employeeId;
	private float salary;
	private String designation;
	
	
	
	public Employee() {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.designation = designation;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", salary=" + salary + ", designation=" + designation
				+ ", getName()=" + getName() + ", getGender()=" + getGender() + ", getPhoneNo()=" + getPhoneNo()
				+ ", getCity()=" + getCity() + "]";
	}
	
	
}
