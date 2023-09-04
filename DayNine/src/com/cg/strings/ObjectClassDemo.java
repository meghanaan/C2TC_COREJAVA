package com.cg.strings;

class Sample{
	
}
class Demo{
	public Demo(){
		System.out.println("In constructor");
	}
	protected void finalize() {
		System.out.println("In finalize");
	}
}
public class ObjectClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		Sample s1 = new Sample();
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());//Hash code is a unique reference to each and every object
		
		Demo d = new Demo();
		System.out.println(d.hashCode());
		
		Demo d1 = d;
		System.out.println(d1.hashCode());
		
		d1= null;
		System.out.println(d1.hashCode());
		System.out.println(d.hashCode());

	}

}
