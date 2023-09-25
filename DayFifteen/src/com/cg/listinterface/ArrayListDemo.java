package com.cg.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List list1 = new ArrayList();
		//list1.add(null);
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.8);
		list1.add(20);
		list1.add('A');
		list1.add(5, "Hi");
		list1.add(20);
		list1.add(null);
		
		System.out.println(list1);
		System.out.println(list1.contains(15));
		list1.remove(false);
		System.out.println(list1);
		list1.remove(9);
		System.out.println(list1);
		System.out.println(list1.size());
		*/
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(21);
		list.add(31);
		list.add(41);
		list.add(51);
		
		List<Integer> listTwo = new ArrayList<>();
		listTwo.add(10);
		listTwo.add(20);
		listTwo.add(30);
		listTwo.add(40);
		listTwo.add(50);
		//listTwo.addAll(list);
		//System.out.println(listTwo);
		listTwo.addAll(2, list);
		System.out.println(listTwo);
		/*
		System.out.println(list1.get(5));
		System.out.println(list1.indexOf(20));
		System.out.println(list1.lastIndexOf(20));
		
		//Collections.sort(list1);
		//System.out.println(list1);
		list1.removeAll(list1);
		System.out.println(list1);*/
	}

}
