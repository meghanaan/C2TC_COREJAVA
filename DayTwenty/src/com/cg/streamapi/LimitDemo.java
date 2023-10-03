package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class LimitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach(System.out::println);
		list.stream().limit(4).forEach(System.out::println);
		list.stream().distinct().forEach(System.out::println);
		
	}

}
