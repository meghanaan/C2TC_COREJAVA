
public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implicit casting = widening casting
		byte b = 10;//1 byte = 8bits
		int i=b; //int - 4 bytes //implicit
		
		float f = 22.14f; //float - 4bytes, double - 8bytes
		double d=f; //Implicit
		
		char ch= 'A'; //char - 2bytes
		int ione=ch;
		
		//Explicit casting or Narrowing casting = It works both size and type
		double done= 10.52f;//Implicit or widening
		long l = (long)done; //long - 8bytes, double - 8bytes
		System.out.println(done);
		System.out.println(l);
		
		long lone = 92334567;
		int itwo = (int)lone; //long- 8bytes, int- 4bytes
		
		byte bone=90; //byte- 8 bits
		char chone = (char)bone;// char- 2bytes
		System.out.println(chone);
	}

}
