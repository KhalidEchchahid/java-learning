package encapsulation;

public class Car {
	
	private String make ;
	private String model ;
	private int year;
	
	Car(String make , String model , int year){
		this.setMake(make) ; 
		this.setModel(model) ;
		this.setYear(year);
	}
	
	Car(Car x){
		this.copy(x);
	}
	
	public String getMake() {
		return make ;
	}
	
	public String getModel() {
		return model ;
	}
	
	public int getYear() {
		return year ;
	}
	
	public void setMake(String make) {
		this.make = make ;
	}
	public void setModel(String model) {
		this.model = model ;
	}
	public void setYear(int year) {
		this.year =year;
	}
	
	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
}




//public class Main {
//
//	public static void main(String[] args) {
//		
//		Car car1 = new Car("dacia" ,"lodgy" , 2020);
////		Car car2 = new Car("hhhh" ,"dddd" , 0000);
////		
////		car2.copy(car1); // car2 = car1 ;
//		
//		Car car2 = new Car(car1);
//		
//		System.out.println(car2.getMake());
//	}
//
//}

