package com.cg.setinterface;
import java.util.Set;
import java.util.Collections;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> lhs = new LinkedHashSet<>();
		lhs.add(new Student(1, "Leela"));
		
		System.out.println(lhs);
		//Collections.sort(lhs);//CTE- hashset / linkedset
	}

}
