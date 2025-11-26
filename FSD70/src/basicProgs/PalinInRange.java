package basicProgs;
import java.util.*;

public class PalinInRange {
	
	
	public static boolean ispalin(int num) {
		int revnum = 0;
		int orgnum = num;
		while(num > 0) {
			int n = num % 10;
			revnum = revnum * 10 + n;
			num = num / 10;
		}
		return orgnum == revnum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your starting range: ");
		int r = sc.nextInt();
		System.out.println("enter your ending range");
		int er = sc.nextInt();
		int count = 0;
		for(int i = r; i <= er; i++) {
			if(ispalin(i)) {
			 count++;
			 System.out.println("Palindrome: "+i);
			} 
		}
		System.out.println("Total count is: "+count);
	}

}
