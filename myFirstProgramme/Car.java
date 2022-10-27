package myFirstProgramme;


//public class Main {
//
//	public static void main(String[] args) { 
//		
//		Car car = new Car();
//		
////		System.out.println(car.make);
////		System.out.println(car.model);
////		System.out.println(car.color);
////		System.out.println(car.year);
//		
////		System.out.println(car.toString());	
//		System.out.println(car);
//	}
//	
//}
//

public class Car {
	
	String make = "dacia";
	String model = "man3ref" ; 
	String color = "black" ;
	int year = 2021 ;
	
	public String toString() {
		return make + "\n" + model +"\n" + color + "\n"+year ;
	}
	
}
