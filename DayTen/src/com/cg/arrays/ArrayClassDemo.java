package com.cg.arrays;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Types
		//Static and Dynamic
		int intArr[] = {10, 20, 15, 22, 35, 18, 14};
		System.out.println("Array is:" + Arrays.toString(intArr));
	
		Arrays.sort(intArr);
		System.out.println("After sorting");
		System.out.println("Array is:" + Arrays.toString(intArr));
		
		int intkey= 25;
		System.out.println(intkey + " found at index " + Arrays.binarySearch(intArr, intkey));
		System.out.println(intkey + " found at index " + Arrays.binarySearch(intArr,1,3, intkey));
		
		int intArrOne[]= {10, 15, 22};
		System.out.println("Array is: " + Arrays.toString(intArrOne));
		
		if(Arrays.equals(intArr, intArrOne))
			System.out.println("Both arrays are equal");
		else
			System.out.println("Both arrays are not equal");
		
		System.out.println("Copy of Array ");
		//int intArrTwo[]= {10, 20, 15, 22, 35, 18, 14};
		int intArrTwo[]= Arrays.copyOf(intArr, 10);
		System.out.println("Array is: "+ Arrays.toString(intArrTwo));
		
		int intArrThree[]= Arrays.copyOfRange(intArr, 1, 3);
		System.out.println("arry is" + Arrays.toString(intArrThree));
		
		Arrays.fill(intArr, intkey);
		System.out.println("Array is: "+Arrays.toString(intArr));
	}

}

