package com.cg.multilevelInheritance;

public class City extends State{
	
	private String cityName;
	private int pincode;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", pincode=" + pincode + "]";
	}
	
	
}
