package basicProgs;
import java.util.*;

public class BigIn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = sc.nextInt();
		System.out.println("Enter number: ");
		int b = sc.nextInt();
		System.out.println("Enter number: ");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is bigger");
		}
		else if(b > a && b > c) {
			System.out.println("b is bigger");
		}
		else {
			System.out.println("c is bigger");
		}
		sc.close();
	}

}
