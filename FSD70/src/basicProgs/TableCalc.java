package basicProgs;
import java.util.*;

public class TableCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 1;
		
		while(i <= 10) {
			System.out.println(num + "*" + i + "=" + (num*i));
			i++;
		}
	}

}
