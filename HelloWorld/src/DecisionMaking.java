
public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if statement
		int x= 19;
		if(x<20) {
			System.out.println("This is if statement");
		}
		//if else statement
		int y = 20;
		if(y>=20) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		//if else if ..else statement
		int m = 30;
		if(m==10) {
			System.out.println("Value of m is 10");
		}
		else if(m>20) {
			System.out.println("Value of m is greater than 20");
			
		}
		else {
			System.out.println("false");
		}
		
		//Nested if statement
		int a =30;
		int b= 20;
		if(a==30) {
			if(b!=20) {
				System.out.println("a value is 30 and b value is 20");
			}
			else {
				System.out.println("false");
			}
		}
		//switch statement
		char grade = 'C';
		switch(grade) {
		case 'A':
			System.out.println("excellent");
			break;
		case 'B':
		case 'C':
			System.out.println("Well done");
			break;
		case 'D':
			System.out.println("You passed");
		case 'F':
			System.out.println("Better try again");
			break;
		default:
			System.out.println("invalid grade");
		
		}
		System.out.println("your grade is " + grade);
	}
	

}
