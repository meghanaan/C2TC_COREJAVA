package com.cg.arrays;

public class MultilevelArray {
	public static void printArray(int c[][]) {
		System.out.println("Array Elements are as follows: ");
		for(int i=0; i<c.length;i++) {
			for(int j=0; j<c[i].length; j++) 
				System.out.println(c[i][j] + " ");
				System.out.println();
			
		}
	}
}




//c[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
/*
 * 
 	0 1 2
 0   [1 2 3
 1    4 5 6
 2    7 8 9]
 */