package com.cg.hierarchialinheritance;

public class HierarchialInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Leela", "Female", 9876504563l, "Bangalore");
		System.out.println(p1);
		
		p1 = new Student();
		p1 = new Student();
		p1 = new Employee();
		
		
	}

}
