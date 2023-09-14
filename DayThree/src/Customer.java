
public class Customer {
	//variables
	private int customerId;
	private String customerName;
	private String customerCity;
	
	void display() {
		
	}
	
	//User defined constructor - no argument
	//constructor
	Customer(){
		System.out.println("In user defined No argument constructor ");
	}
	//User defined constructor - parameterised/argumented constructor
	Customer(int id, String name, String city){
		customerId = id;
		customerName = name;
		customerCity = city;
	}
	
	//Constructors 
	//1.Special Methods
	//2.Methods has return type; Constructor doesn't have return type
	//3. Method name - can be any valid name; constructor name - always be same as your class name
	//4. Method invoked using object reference(Manually); Constructor - automatically invoked at the time of object creation
	//5. Types - Default and UserDefined constructor
	//6. Default - no argument constructor
	//7. User Defined - no argument constructor and parameterised/argumented constructor
	
	//Methods
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}
	
	
}
