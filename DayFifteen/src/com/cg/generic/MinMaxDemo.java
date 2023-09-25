package com.cg.generic;

public class MinMaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float arr[]= {3.22f, 6.8f, 222.8f, 9f, 6.08f};
		MinMaxImp<Float> obj1=new MinMaxImp<Float>(arr);
		System.out.println("Minimum value is: "+obj1.min());
		System.out.println("Maximum value is: "+obj1.max());
		
		String arrone[]= {"Megha", "Ghana", "Shri", "Pooja", "Suma"};
		MinMaxImp<String> obj2=new MinMaxImp<String>(arrone);
		System.out.println("Minimum value is: "+obj2.min());
		System.out.println("Maximum value is: "+obj2.max());
		
		Person p[] = {new Person("Megha", "Kodagu"),new Person("Shobhi", "Kushalnagar"), new Person("Kala", "Tumkur")};
		MinMaxImp<Person> obj3=new MinMaxImp<Person>(p);
		System.out.println("Minimum value is: "+obj3.min());
		System.out.println("Maximum value is: "+obj3.max());
	}

}
