package com.cg.hierarchialinheritance;

public class Person {
	 
	private String name;
	private String gender;
	private long phoneNo;
	private String city;
	
	public Person() {
		super();
		this.name = name;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.city = city;
	}
	public Person(String string, String string2, long l, String string3) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.city= city;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", phoneNo=" + phoneNo + ", city=" + city + "]";
	}
	
	
}
