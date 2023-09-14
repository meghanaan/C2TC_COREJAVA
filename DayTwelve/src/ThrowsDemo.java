import java.io.IOException;

public class ThrowsDemo {
	
	void myMethod(int num) throws IOException, ClassNotFoundException{
		if(num==1) {
			throw new IOException("IO exception occured");
		}
		else {
			throw new ClassNotFoundException("Class not found excption occured");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo td = new ThrowsDemo();
		try {
			td.myMethod(1);
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
//IOException - 
//InputMismatchException - 
//ArithmeticException - run time