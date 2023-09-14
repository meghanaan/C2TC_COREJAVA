package abstraction;

public abstract class AbstractClass {
	
	String eName;
	String eAddress;
	int eId;
	
	
	public AbstractClass(String eName, String eAddress, int eId) {
		super();
		this.eName = eName;
		this.eAddress = eAddress;
		this.eId = eId;
	}
	public void department(){
		System.out.println("This employee work for E&C department");
	}
	public abstract void jobRole();
	
}
