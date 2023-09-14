package com.cg.multithreading;

public class ExecutorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t1 = new ChildThread(5, "first thread");
		ChildThread t2 = new ChildThread(10, "second thread");
		
		t1.start();
		t2.start();
	}

}
