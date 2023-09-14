package com.cg.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UsingRunnable(30, 20, "Hello World!");
		Thread t1 = new Thread(new UsingRunnable(30, 20, "Hello World!"));
		t1.start();
	}

}
