package basicProgs;

import java.util.*;



class StringMethods{
	
	void toggle(String n) {
		
		char [] toggle = n.toCharArray();
		String res ="";
		
		for(char i : toggle){
			
			char c = i;
			
			int a = (int) (c);
			
			if(a >= 65 && a <= 90) {
				res += (char)(a+32);
			}
			
			else {
				res += (char)(a-32);
			}
			
		}
		
		System.out.println(res);
		
	}
	
	
	void find(String s) {
		
		
		int num = 0;
		int capi = 0;
		int lower = 0;
		int symbol = 0;
		
		for(char c : s.toCharArray()) {
			
			if(c >= '0' && c <= '9') {
				num++;
			}
			
			else if(c >= 'A' && c <= 'Z') {
				capi++;
			}
			else if(c >= 'a' && c <= 'z') {
				lower++;
			}
			
			else if(c == ' ') {
				continue;
			}
			else {
				symbol++;
			}
		}
		 
		System.out.println("Numbers: " + num);
		System.out.println("Capitals: " + capi);
		System.out.println("Lowers: " + lower);
		System.out.println("Symbols: " + symbol);
		
	}
	
}


public class StringAssignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringMethods s = new StringMethods();
		
		
		
		System.out.print("Enter a String to change into toggle case: ");
		
		String name = sc.nextLine();
		
		s.toggle(name);
		
		
		
		System.out.println("Enter your desired sentence: ");
		
		StringMethods n = new StringMethods();
		
		String count = sc.nextLine();
		
		n.find(count);

	}

}
