package polymorphism;
import java.util.Scanner ;
public class Main {

	public static void main(String[] args) {
		
//		Car car = new Car();
//		Bike bike = new Bike();
//		Boat boat = new Boat();
//		
//		Vehicle[] racers = {car , bike , boat };
//		
//		for(Vehicle x : racers) {
//			x.go();
//		}
		Animal animale ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Animal");
		String name = scanner.next();
		
		if(name.equals("dog")) {
			animale = new Dog();
			animale.speak();
		}else if(name.equals("cat")){
			animale = new Cat();
			animale.speak();
		}else {
			System.out.println("*******");

		}
		
		
		
	}

}
