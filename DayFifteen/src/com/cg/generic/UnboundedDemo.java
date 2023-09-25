package com.cg.generic;

import java.util.Arrays;
import java.util.List;

public class UnboundedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(1, 2, 3);
		UnboundedWildCard.display(intList);
		
		List<String> stringList = Arrays.asList("Hi", "Hello", "Welcome", "To", "Everyone");
		UnboundedWildCard.display(stringList);
		
		Person p[] = {new Person("Megha", "Kodagu"),new Person("Shobhi", "Kushalnagar"), new Person("Kala", "Tumkur")};
		List<Person> personlist = Arrays.asList(p);
		UnboundedWildCard.display(personlist);
	}

}
