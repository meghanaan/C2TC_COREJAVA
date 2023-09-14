
public class MyClass {
	
	public static void validate(int age) {
		if(age<21 || age>27) {
			//thrown not eligible
			throw new ArithmeticException ("not eligible");
		}
		else {
			//eligible
			System.out.println("Eligible to attend military selection");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(30);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		

	}

}
