package com.cg.packageone;

public class TestOne {
	
	public int id;
	public void display(){
		System.out.println("access Modifier");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOne t1= new TestOne();
		t1.id=5;
		System.out.println(t1.id);
		t1.display();
	}

}
