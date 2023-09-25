package com.cg.mapinterface;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> lhm = new LinkedHashMap<>();
		lhm.put("Megha", "abc@gmail.com");
		lhm.put("Gana", "ghana@gmail.com");
		lhm.put("Deepak", null);
		lhm.put(null, "abc123@gmail.com");
		lhm.put(null, null);
		System.out.println(lhm);
	}

}
