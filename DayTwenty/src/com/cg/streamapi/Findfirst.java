package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class Findfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(12, 20, 35, 47, 55, 68, 75);
		int value = 0;
		for(int i:list) {
			if(i%5==0) {
				value = i*2;
				break;
			}
			
		}
		System.out.println(value);
		
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(99999));
	}

}
