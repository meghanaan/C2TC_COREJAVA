package com.cg.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi;
		//Dynamic binding
		rbi = new SBI();
		System.out.println(rbi.getRateofIntrest());
		System.out.println(rbi.getClass());
		rbi = new HDFC();
		//System.out.println(rbi.getRateofIntrest());
		rbi = new ICICI();
		System.out.println(rbi.getRateofIntrest());
	}

}
