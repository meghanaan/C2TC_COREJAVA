package javaconcepts;

public class MyCalculation extends Calculation {
	
	public void multiplication(int a, int b) {
		c= a*b;
		System.out.println("the product of the given numbers: "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculation demo = new MyCalculation();
		int a = 20, b = 10;
		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
		demo.division(a, b);
	}

}
