package com.cg.userdefinedobjects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Student>studentList = new ArrayList<Student>();
		studentList.add(new Student(11, "Megha", 78));
		studentList.add(new Student(21, "Pooja", 85));
		studentList.add(new Student(13, "Anusha", 68));
		studentList.add(new Student(41, "Neha", 72));
		studentList.add(new Student(1, "Deepa", 81));
		
		System.out.println("Before Sorting: "+ studentList);
		Collections.sort(studentList);
		System.out.println("After Sorting: "+studentList);
		
		List <Person>personList = new ArrayList<Person>();
		personList.add(new Person("Ajay", "Mysore"));
		personList.add(new Person("Madhu", "Tumkur"));
		personList.add(new Person("Avi", "Mandya"));
		personList.add(new Person("Kala", "Banglore"));
		
		
		System.out.println("Before sorting:"+personList);
		
		Collections.sort(personList, new SortByname());
		System.out.println("After sorting: "+personList);
		
		Collections.sort(personList, new SortBycity());
		System.out.println("After Sorting with respect to city:"+personList);
		
	}

}
