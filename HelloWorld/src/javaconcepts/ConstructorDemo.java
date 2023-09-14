package javaconcepts;

public class ConstructorDemo {
	
	/*Simple Constructor
	ConstructorDemo(){
		System.out.println(" Simple constructor example");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo sim = new ConstructorDemo();
		
	}*/
	int x;
	ConstructorDemo(){
		x = 10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor is invoked when you initialize an object
		ConstructorDemo t1 = new ConstructorDemo();
		ConstructorDemo t2 = new ConstructorDemo();
		System.out.println(t1.x + " "+ t2.x );
		
	}
}


/*Parameterized Constructor
public class ConstructorDemo {
	
	
	int x;
	ConstructorDemo(int i){
		x = i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor is invoked when you initialize an object
		ConstructorDemo t1 = new ConstructorDemo(10);
		ConstructorDemo t2 = new ConstructorDemo(20);
		System.out.println(t1.x + " "+ t2.x );
		
	}
}*/
