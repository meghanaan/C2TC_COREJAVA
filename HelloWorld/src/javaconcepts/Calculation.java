package javaconcepts;

public class Calculation {
	int c;
	public void addition(int a, int b) {
		c=a+b;
		System.out.println("the sum of the given numbers: "+c);
	}
	public void subtraction(int a, int b) {
		c= a-b;
		System.out.println("the difference of the given numbers: "+c);
		
	}
	public void division(int a, int b) {
		c = a/b;
		System.out.println("the quotient of the given number is: "+c);
	}
}

