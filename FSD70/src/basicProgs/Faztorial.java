package basicProgs;
import java.util.*;

public class Faztorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double num = sc.nextDouble();
		double total = 1;
		
		for(double i = 2; i <= num; i++) {
			total = total*i;
		}
		System.out.println("Factorial is = "+total);

	}

}
