package basicProgs;
import java.util.*;

public class Passwordcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String password = "fazilsk";
		
		int i = 1;
		boolean p = false;
		
		while(i <= 3 ) {
			System.out.println("Enter yor password: ");
			String pass = sc.nextLine();
			if(pass.equals(password)) {
				p = true;
				System.out.println("password matched");
				break;
			}
			else {
				System.out.println("password mismatch");
			}
			i++;
			
		}
		System.out.println(p == true ? "Login successfull":"Maximum limit reached");
		

	}

}
