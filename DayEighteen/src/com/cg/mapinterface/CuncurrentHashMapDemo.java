package com.cg.mapinterface;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Hashtable;

public class CuncurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap();
		chm.put(100, "Hello");
		chm.put(101, "Haii");
		chm.put(102, "everyone");
		System.out.println(chm);
		 
		chm.putIfAbsent(103, "hello");
		System.out.println(chm);
		
		chm.remove(101, "Haii");
		System.out.println(chm);
		
		chm.replace(100, "Hello","Hoi");
		System.out.println(chm);
	}

}
