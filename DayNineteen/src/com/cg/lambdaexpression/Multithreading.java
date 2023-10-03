package com.cg.lambdaexpression;

/*class Eclipse implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Eclipse run method");
	}
	
}*/
public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Eclipse e = new Eclipse(); Thread obj = new Thread(e); obj.start(); */
		 
		new Thread(() ->{System.out.println("Iam in Eclipse run method");}).start();
	}

}
