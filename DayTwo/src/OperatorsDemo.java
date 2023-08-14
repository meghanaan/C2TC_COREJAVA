
public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		int b=20;
		int c=10;
		System.out.println(a + "" + b); //concatenation
		String d = 2+"4";//concatenation
		int e = 2+4;//addition
		String f = "2" + "4";//concatenation
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		---
		++a; //11
		int d = ++a + b + a--;//12+20+12
		int e = ++a + b + a--;//12+20+11=43
			
		System.out.println(d);
		System.out.println(e);
		
		int x = c++ + a + b--;
		//10+11+20
		System.out.println(x);
		//pre increment / pre decrement
		//1. Increment/ Decrement
		//2. Assign the result to the variable or further use
		
		//post increment / post decrement
		//1. Assign the value to the variable or for further use
		//2. Increment/decrement
		
		System.out.println(c);
		//Ternary operator
		c = (10 ==c) ? 1 : 0;
		System.out.println(c);
		*/
		int i;
		int j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	

}
