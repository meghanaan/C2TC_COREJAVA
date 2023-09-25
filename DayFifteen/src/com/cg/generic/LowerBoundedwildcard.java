package com.cg.generic;

import java.util.List;

public class LowerBoundedwildcard {
	
	public static void displayNumber(List<? super Float> list) {
		for(Object n:list) {
			System.out.println(n);
		}
	}
}
