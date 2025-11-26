package collections;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		
		Stack<Integer> num = new Stack<>();
		
		num.push(5);
		num.push(8);
		num.push(33);
		
		System.out.println(num);
		
		num.pop();
		
		System.out.println(num);
		
		
		String s = "racecar";
		String g = null;
		
		for(int i = 0; i < s.length();i++) {
			g += s.charAt(i);
		}
		System.out.println(g);
		
		if(s.equalsIgnoreCase(g)) {
			System.out.println("palin");
		}
		else {
			System.out.println("no");
		}

	}

}
