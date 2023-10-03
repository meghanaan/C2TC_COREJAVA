package com.cg.javaeigthfeature;

import java.util.Arrays;
import java.util.List;

public class MethodReferencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Collection output:" +list);
		System.out.println("Internal iteration");
		list.forEach(values -> System.out.println(values));
		
		System.out.println("Method referencing output ");
		list.forEach(System.out::println);
		
		System.out.println("Method referencing output - user defined");
		list.forEach(Doubleit::doubleit);
		
		System.out.println("Addition");
		list.forEach(Mainmethod::main);
	}
	

}
class Doubleit{
	public static void doubleit(int i) {
		System.out.println(i*2);
	}
}
class Mainmethod{
	public static void main(int i) {
		System.out.println(i+3);
	}
}
