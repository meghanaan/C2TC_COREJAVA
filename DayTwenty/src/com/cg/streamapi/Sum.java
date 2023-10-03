package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		System.out.println(list.stream().map(i->i*2).reduce(0,(c,e) -> (c+e)));
		
		
		
		//Normal code for sum
		/*
		 * int result = 0; for(int i:list) { result = result+i*2; }
		 * System.out.println(result);
		 */
		
		
	}

}
