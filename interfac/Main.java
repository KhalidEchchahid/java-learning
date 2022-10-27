package interfac;

public class Main {

	public static void main(String[] args) {
		
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		Huwk hawk = new Huwk();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.flee();
		fish.hunt();
	}

}
