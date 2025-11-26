package basicProgs;
import java.util.*;

public class SwitchProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choice 1-even/odd, 2-bigIn2, 3-bigIn3");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b,c,d;
		
		switch (a){
			
		case 1:
			System.out.println("Enter your number: ");
			b = sc.nextInt();
			System.out.println(b % 2 == 0 ? "even": "odd");
			break;
		
		case 2:
			System.out.println("enter your numbers: ");
			b = sc.nextInt();
			c = sc.nextInt();
			System.out.println(b > c ? "the bigger num is: "+b:"the bigger num is "+c);
			break;
		
		case 3:
			System.out.println("enter your numbers: ");
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			if(a>b && a>c) {
				System.out.println("bigger num is "+a);
			}
			else if(b > a && b > c) {
				System.out.println("bigger num is "+b);
			}
			else {
				System.out.println("bigger num is "+c);
			}
			break;
			
		default:
			System.out.println("Wrong option entered");
		}

	}

}
