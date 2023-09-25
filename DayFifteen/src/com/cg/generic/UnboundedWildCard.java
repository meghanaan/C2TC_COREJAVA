package com.cg.generic;

import java.util.List;

public class UnboundedWildCard {
	
	public static void display(List<?> ll) {
		for(Object o:ll) {
			System.out.println(o);
		}
	}
}
