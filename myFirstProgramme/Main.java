package myFirstProgramme;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);

		try {
		
		System.out.println("X : ");
		int x = scanner.nextInt();
		
		System.out.println("Y : ");
		int y = scanner.nextInt();
		
		int z = x/y;
		System.out.println(z);

		}catch(ArithmeticException e) {
			System.out.println("you can't divide by zero");
		}catch(InputMismatchException e) {
			System.out.println("Enter an num ");
		}catch(Exception e) {
			System.out.println("something went wrong !");
		}finally {
			System.out.println("this will always print");
			scanner.close();
		}
	}
}


