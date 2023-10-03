package com.cg.javaeigthfeature;

import java.util.List;

import java.util.Arrays;

public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list);
		
		System.out.println("Internal iteration");
		list.forEach(values -> System.out.println(values));
		
		
		//External iteration
		/*for(int i= 0; i<6; i++) {
			System.out.println(list.get(i));
		}
	
		for(Integer i: list) {
			System.out.println(i);
		}*/
	}
}
