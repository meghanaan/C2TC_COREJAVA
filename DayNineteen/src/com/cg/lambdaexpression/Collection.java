package com.cg.lambdaexpression;

import java.util.ArrayList;
public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		/*for(Object a:al) {
			System.out.println(a);
		}*/
		al.forEach(a -> System.out.println(a));

	}

}
