package com.cg.singleinheritance;

public class Student extends Citizen{
	private int id;
	private String collegeName;
	
	
	public Student() {
		super();
	}
	
	
	
	public Student(String name, String dateofbirth, String address, String aadharNo, long phoneno) {
		super(name, dateofbirth, address, aadharNo, phoneno);
		// TODO Auto-generated constructor stub
		this.id=id;
		this.collegeName=collegeName;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", collegeName=" + collegeName + "]";
	}
	
	
}
