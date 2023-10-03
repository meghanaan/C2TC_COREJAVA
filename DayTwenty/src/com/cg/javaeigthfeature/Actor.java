package com.cg.javaeigthfeature;

public interface Actor {
	
	void act();
	void speak();
	
	default void bodyLanguage() {
		System.out.println("I can maintain good body language");
	}
}
