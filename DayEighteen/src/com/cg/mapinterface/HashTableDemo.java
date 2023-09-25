package com.cg.mapinterface;
import java.util.Map;
import java.util.Hashtable;
public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> ht = new Hashtable<>();
		ht.put("Megha", "abc@gmail.com");
		ht.put("Gana", "ghana@gmail.com");
		//ht.put("Deepak", null);
		//ht.put(null, "abc123@gmail.com");
		//ht.put(null, null);
		System.out.println(ht);
	}

}
