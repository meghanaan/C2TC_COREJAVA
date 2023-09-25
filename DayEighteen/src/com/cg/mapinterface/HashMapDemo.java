package com.cg.mapinterface;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hm = new HashMap<>();
		//Key should be unique, value can be duplicate
		hm.put("Let us C", 320);
		hm.put("Python", 440);
		hm.put("Music is the food for the soul", 365);
		hm.put("Java", 390);
		hm.put("Classmate", 410);
		hm.put("Application Development using SpringBoot", 600);
		System.out.println(hm);
		
		Set set = hm.entrySet();//set of values as a single unit
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me);
		}
		Map<String, Student> hmOne = new HashMap<>();
		hmOne.put("Megha", new Student(1, "Lekha"));
		//hmOne.put("Gana", "ghana@gmail.com");
		hmOne.put("Deepak", null);
		//hmOne.put(null, "abc123@gmail.com");
		hmOne.put(null, null);
		System.out.println(hmOne);
	}

}
