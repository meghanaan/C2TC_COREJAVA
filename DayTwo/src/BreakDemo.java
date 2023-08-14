
public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++)
		{
			if(i<7)
				//break;//will break the current iteration and all the upcoming iterations
				continue;//will skip the current iteration alone
				System.out.println(i);
		}
	}

}
