package polymorphism;

public class UseMammal {

	public static void main(String[] args) {

		Mammal mammal =null;
		mammal = new Lion();
		mammal = new Goat();

		mammal.text();

	}

}
