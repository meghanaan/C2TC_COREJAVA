package com.cg.linkedinterface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
public class LikedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.addFirst(5);
		System.out.println(ll);
		ll.addLast(3);
		System.out.println(ll);
		ll.add(2, 60);
		ll.add(40);
		System.out.println(ll);
		System.out.println("Number list is "+ ll);
		System.out.println("First element is: "+ll.getFirst());
		System.out.println("Last element is: "+ll.getLast() );
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Number list after removing first and last element is: "+ll);
		
		ListIterator<Integer> li = ll.listIterator();
		
		while (li.hasNext())
			System.out.println(li.next()+ "\t");
		System.out.println();
		
		li = ll.listIterator(ll.size());
		while(li.hasPrevious()) {
			int n= li.previous();
			System.out.println(n+"\t");
			if(n==20)
				li.add(99999);
			if(n==60)
				li.set(5555);
		}
		System.out.println("Number List is " +ll);
		Collections.sort(ll);
		System.out.println("Number list in Ascending order: "+ll);
		Collections.reverse(ll);
		System.out.println("Number list in Descending order: "+ll);
	}

}
