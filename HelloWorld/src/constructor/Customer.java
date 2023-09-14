package constructor;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerCity;
	private long customerPhno;
	
	void display() {
		
	}
	Customer(){
		System.out.println("No aurguement constructor");
	}
	
	public Customer(int customerId, String customerName, String customerCity, long customerPhno) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerPhno = customerPhno;
	}
	
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
	public long getCustomerPhno() {
		return customerPhno;
	}
	public void setCustomerPhno(long customerPhno) {
		this.customerPhno = customerPhno;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", customerPhno=" + customerPhno + "]";
	}
	
	
	
}
