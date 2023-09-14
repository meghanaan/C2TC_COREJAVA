package abstraction;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Animal goat = new Herbivores();
		Animal tiger = new Carnivores();
		goat.eat();
		tiger.eat();*/
		Scanner s = new Scanner(System.in);
		String title = s.nextLine();
		Mymovie m = new Mymovie();
		System.out.println("the title is :"+ m.getTitle());
	}

}
