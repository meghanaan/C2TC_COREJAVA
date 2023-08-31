package com.cg.interfaces;
interface Dad{
	void snoring();
}
interface Mom{
	void snoring();
}
class You implements Dad, Mom{
	
	@Override
	public void snoring() {
		System.out.println(" I have the habit of snoring");
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
