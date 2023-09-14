
public class ConstructorExmple {
	/*private String name;
	
	ConstructorExmple(){
		System.out.println("Constructor called:");
		name = "Program";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExmple obj = new ConstructorExmple();
		System.out.println("The name is " + obj.name);
	}*/
	
	/*3 types of constructor
	 1. No-Arg constructor
	 2. Parameterised Constructor
	 3. Default Constructor
	*/
	
	// No-Arg Constructor
	//Similar to methods, a java constructor may or may not have any parameters
	
	int i;
	//constructor with no parameter
	private ConstructorExmple() {
		i = 5;
		System.out.println("Constructor is called" );
	}
	public static void main(String[] args) {
		ConstructorExmple obj = new ConstructorExmple();
		System.out.println("Value of i:" + obj.i);
	}
}
