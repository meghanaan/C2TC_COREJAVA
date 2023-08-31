package com.cg.overloading;

public class Point {
	
	private float x;
	private float y;
	
	//constructor overloading
	//c1 - 0 parameter
	public Point() {
		x=0.0f;
		y= 0.0f;				
	}
	//c2 - 1 parameter
	public Point(int x){
		this.x=x;
	}
	// c3- 2 parameter
	public Point(float x) {
		this.x=x;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
