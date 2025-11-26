package basicProgs;
import java.util.*;

//import com.sun.source.doctree.SystemPropertyTree;

public class VoteEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("hello "+name);
		System.out.println("Enter Nationality: ");
		String nat = sc.nextLine();
		String natt = nat.toLowerCase();
		if(natt.equals("indian")) {
			System.out.println("Enter Age: ");
			int age = sc.nextInt();
			if(age >= 18) {
				System.out.println("eligible to vote");
			}
			else {
				System.out.println("Not eligible to vote");
			}
		
		}
		else {
			System.out.println("Not Eligible for vote");
		}
		sc.close();	}

}
