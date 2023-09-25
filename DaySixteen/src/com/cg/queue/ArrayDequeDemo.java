package com.cg.queue;
import java.util.Deque;
import java.util.ArrayDeque;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("A");
		arrayDeque.add("B");
		arrayDeque.add("C");
	    
		System.out.println(arrayDeque);
		
		arrayDeque.offer("F");
		System.out.println(arrayDeque);
		
		for(String item : arrayDeque)
			System.out.println(item);
	}
	

}

//For loop
//For Each loop
//Iterator,
//List iterator- Only in List interface - arraylist and linkedlist
//Enumeration - Only in vector

//Implementable class of Queue- Linked List
