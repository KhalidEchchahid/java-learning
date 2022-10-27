package tp1;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		
				Scanner scanner = new Scanner(System.in) ;
				System.out.println(" X :" );
				double x = scanner.nextDouble();
				if(x>0) {
					System.out.println (" positive ");
				}
				else if(x == 0){
					System.out.println (" null ");
					
				}else {
					System.out.println (" negative ");
				}
				scanner.close();
			}

}
