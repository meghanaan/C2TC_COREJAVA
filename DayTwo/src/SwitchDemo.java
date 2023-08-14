
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x='a';
		switch(x) {
		case 'l':
		case 'L':
			System.out.println("x is a letter");
			break;
		case 'd':
		case 'D':
			System.out.println("x is a digit");
			break;
		default:
			System.out.println("x is neither letter nor a digit");
		}
	}

}
