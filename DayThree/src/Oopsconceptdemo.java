
public class Oopsconceptdemo {
	private int serialNum;
	private String name;
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	@Override
	public String toString() {
		return "Oopsconceptdemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
