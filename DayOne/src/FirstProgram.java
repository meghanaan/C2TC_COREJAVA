
public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		//System.out.println("Welcome to C2TC program");
		
		
		//Reverse string
		String str= "India", nstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Original word:"+ str);
		System.out.println("Reversed word:"+ nstr);
	}
}
