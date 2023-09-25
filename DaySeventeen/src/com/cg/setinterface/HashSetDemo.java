package com.cg.setinterface;
import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {
	
	static void addElements(Set<Integer> numberHashSet) {
		numberHashSet.add(61);
		numberHashSet.add(41);
		numberHashSet.add(91);
		numberHashSet.add(null);
		numberHashSet.add(null);
		numberHashSet.add(51);
		numberHashSet.add(80);
		numberHashSet.add(11);
		numberHashSet.add(20);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numberHashSet = new HashSet<>();
		addElements(numberHashSet);
		
		System.out.println("numberHashSet:" +numberHashSet);
		
		Set<Integer> numberHashSetOne = new HashSet<>();
		numberHashSetOne.add(20);
		numberHashSetOne.add(80);
		numberHashSetOne.add(91);
		numberHashSetOne.add(50);
		numberHashSetOne.add(60);
		numberHashSetOne.add(10);
		numberHashSetOne.add(21);
		
		System.out.println("numberHashSetOne:" + numberHashSetOne);
		
		Set<Integer> numberHashSetTwo = new HashSet<>();
		addElements(numberHashSetTwo);
		System.out.println("numberHashSetTwo:" + numberHashSetTwo);
		//Union
		numberHashSetTwo.addAll(numberHashSet);
		
		System.out.println("Union:" +numberHashSetTwo);
		
		//Insertion
		numberHashSetTwo.retainAll(numberHashSetOne);
		System.out.println("Intsertion:" +numberHashSetTwo);
		
		
		//Differences
		numberHashSetTwo.removeAll(numberHashSetOne);
		System.out.println("Difference:" +numberHashSetTwo);
	}

}
