package com.cg.lambdaexpression;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d = (int radius) ->{System.out.println("Draw a circle with a radius of: "+ radius);};
		d.draw(10);
	}
	

}
