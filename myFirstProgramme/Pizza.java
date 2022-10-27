package myFirstProgramme;

//public class Main {
//
//	public static void main(String[] args) { 
//		
//		Pizza pizza = new Pizza("thicc crust" , "tomato" , "mozzerella" );
//		
//		System.out.println(pizza.bread);
//		System.out.println(pizza.sauce);
//		System.out.println(pizza.cheese);
////		System.out.println(pizza.topping);
//	}
//	
//}


public class Pizza {
	
	String bread ;
	String sauce ;
	String cheese ;
	String topping ;
	
	Pizza(String bread ,String sauce,String cheese,String topping){
		
		this.bread = bread;
		this.sauce = sauce ;
		this.cheese = cheese ;
		this.topping = topping ;
		
	}
	
	Pizza(String bread ,String sauce,String cheese){
		
		this.bread = bread;
		this.sauce = sauce ;
		this.cheese = cheese ;	
	}
	
}
