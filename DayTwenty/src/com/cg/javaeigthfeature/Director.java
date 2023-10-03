package com.cg.javaeigthfeature;

public class Director {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h = new Hero();
		h.act();
		h.speak();
		h.humble();
		
		Villian v = new Villian();
		v.act();
		v.speak();
		v.cruel();
		v.bodyLanguage();
	}

}
