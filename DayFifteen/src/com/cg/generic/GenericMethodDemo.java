package com.cg.generic;

public class GenericMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intarray = {20, 10, 50, 35, 10};
		String[] str = {"Java", "Programming", "Language"};
		
		Person[] p = {new Person("Megha", "Kodagu"),new Person("Shobhi", "Kushalnagar"), new Person("Kala", "Tumkur")};
		GenericMethod gm = new GenericMethod();
		gm.displayArrayElements(str);
		gm.displayArrayElements(intarray);
		gm.displayArrayElements(p);
		
	}

}
