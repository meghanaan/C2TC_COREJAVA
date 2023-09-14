package abstraction;

public class ExtendAbstract extends AbstractClass{
	
	public ExtendAbstract(String eName, String eAddress, int eId) {
		super(eName, eAddress, eId);
		// TODO Auto-generated constructor stub
	}
	public void jobRole(){
		System.out.println("This is an abstract method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendAbstract e = new ExtendAbstract("Sukanya", "Bangalore", 12);
		e.department();
		e.jobRole();
	}

}
