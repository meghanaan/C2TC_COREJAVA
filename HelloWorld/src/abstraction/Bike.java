package abstraction;

public abstract class Bike {

		//abstract void run();
	Bike(){
		System.out.println("bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed");
	}
}
