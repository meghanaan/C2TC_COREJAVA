package constructor;

public class ConstructorDemo {
	
	public static void main(String args[]) {
		Customer c = new Customer();
		c.setCustomerId(1);
		c.setCustomerName("Megha");
		c.setCustomerCity("Kodagu");
		c.setCustomerPhno(9876543234l);
		System.out.println(c);
	}
	
	
}
