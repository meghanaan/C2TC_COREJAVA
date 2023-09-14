package javaconcepts;

public class ThisExample {
	//instance variable num
	int num = 10;
	ThisExample(){
		System.out.println("Example on this keyword");
	}
	ThisExample(int num){
		//invoking default constructor
		this();
		//assigning the local variable num to the instance variable num
		this.num= num;
	}
	public void greet() {
		System.out.println("print");

	}
	public void  print() {
		//local variable num
		int num = 20;
	
	//printing the local variable
		System.out.println("Local variable : "+ num);
		//printing the instance variable
		System.out.println("Instance variable : "+ this.num);
		//invoking the greet method of a class
		this.greet();
	}
	public static void main(String args[]) {
		//Instantiation the class
		ThisExample obj1 = new ThisExample();
		//invoking the print method
		obj1.print();
		
		//passing a new value to the num variable through parameterized constructor
		ThisExample obj2 = new ThisExample(30);
		//invoking the print method again
		obj2.print();
	}

}
