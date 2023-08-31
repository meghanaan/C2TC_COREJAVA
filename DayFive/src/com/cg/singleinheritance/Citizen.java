package com.cg.singleinheritance;

public class Citizen {
	private String name;
	private String dateofbirth;
	private String address;
	private String aadharNo;
	private long phoneno;
	
	
	public Citizen() {
		super();
	}
	
	public Citizen(String name, String dateofbirth, String address, String aadharNo, long phoneno) {
		super();
		this.name = name;
		this.dateofbirth = dateofbirth;
		this.address = address;
		this.aadharNo = aadharNo;
		this.phoneno = phoneno;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", dateofbirth=" + dateofbirth + ", address=" + address + ", aadharNo="
				+ aadharNo + ", phoneno=" + phoneno + "]";
	}
	
}
