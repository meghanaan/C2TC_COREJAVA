
public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to find the greatest of two numbers
		int a = 100;
		int b = 150;
		int greatest = a>b ? a:b;
		System.out.println(greatest);
		//Program to find the smallest of two numbers
		int smallest = a<b ? a:b;
		System.out.println(smallest);
		//greatest of three numbers
		int c= 250;
		//int d = a>b? a:b;
		//int z= d>c? d:c;
		int z = a>b ? (a>c?a:c):(b>c?b:c);
		System.out.println(z);
		
		//program to check whether a number is even or odd
		int num1 = 99;
		if(num1%2==0) //or if(num1%2==1)
		{
			System.out.println(num1+ " is a even");
		}
		else {
			System.out.println(num1 +" is a odd");
		}
		
		//greatest of two numbers
		int x= 1000;
		int y= 220;
		if(x>y) {
			System.out.println(x+ " is a greatest number");
		}
		else {
			System.out.println(y+" is a greatest number");
		}
		//greatest of three numbers
		int m = 100;
		int n= 50;
		int o = 150;
		if(m>n && m>o) {
			System.out.println(m+ " is a greatest number");
			
		}
		else if(n>o) {
			System.out.println(o+ " is a greatest number");
			
		}
		else{
			System.out.println(o+ " is a greatest number");
		}
	}
	
	
		

	

}
