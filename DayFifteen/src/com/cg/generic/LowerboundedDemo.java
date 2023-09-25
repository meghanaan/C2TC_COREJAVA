package com.cg.generic;

import java.util.Arrays;
import java.util.List;

public class LowerboundedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(1,2,3);
		LowerBoundedwildcard.displayNumber(intList);
		
		List<Number> numberList = Arrays.asList(1,2,3);
		LowerBoundedwildcard.displayNumber(numberList);
		
		List<Float> floatList = Arrays.asList(1.0f,2.0f,3.0f);
		LowerBoundedwildcard.displayNumber(floatList);
	}

}
