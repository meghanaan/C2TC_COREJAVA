
public class DecisionMakingWithOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=8;
		int y=7;
		int a=10;
		int b=11;
		
		if(x>y) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		//Bitwise OR(|) and Logical OR(||)
		//Bitwise AND(&) and Logical AND(&&)
		if(!(a<b) || (a==b))
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
