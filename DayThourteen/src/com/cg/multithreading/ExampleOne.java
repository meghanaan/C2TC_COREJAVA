package com.cg.multithreading;
class Eclipse extends Thread{
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("In eclipse thread");
			//System.out.println(Thread.currentThread().getId());
			//System.out.println(Thread.currentThread().getName());
			//System.out.println(Thread.currentThread().getPriority());
			try {
				sleep(3000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
}
class Chrome extends Thread{
	public void run() {
		//for(int i=0; i<10;i++)
		//System.out.println("In chrome thread");
		//System.out.println(Thread.currentThread().getId());
		//System.out.println(Thread.currentThread().getPriority());
	}
}

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse e = new Eclipse();
		e.start();
		e.setPriority(1);
		Chrome c = new Chrome();
		c.start();
		c.setPriority(Thread.NORM_PRIORITY);
		//System.out.println("Main thread id: "+Thread.currentThread().getId());
		//System.out.println("Main thread name: "+Thread.currentThread().getName());
		//System.out.println("main thread priority:" +Thread.currentThread().getPriority());
	}

}
