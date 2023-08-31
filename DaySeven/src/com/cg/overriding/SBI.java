package com.cg.overriding;

//Subclass
public class SBI extends RBI {
	
	public float getRateofIntrest() {
		return 7.0f;
	}
	public SBI getObject(){
		return this;//this keyword is used to refer to the current object
		
	}
}
