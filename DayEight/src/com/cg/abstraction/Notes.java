package com.cg.abstraction;

public  abstract class Notes {

	//1. abstract keyword
	//2. variables, Methods - Abstract method & Non Abstract method, Constructors
	//3. Class extends abstract class- Concrete class and object of the class- Concrete class
	//4. whenever there is an abstract method, it is mandatory to make class as abstract
	//4. Whenever a class is an abstract, it is optional to have abstract method
	
	int id;//variable
	//constructors
	public Notes() {
		
	}
	//Method - non abstract method
	public void display() {
		
	}
	//Method - abstract method
	public abstract void show();
}


	
	