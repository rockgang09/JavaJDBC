package oopsProgs;

import java.util.Scanner;

public class DemoTry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		try {
		c = a/b;
		}
		
		catch(Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();//prints at which line error is there.
		}
		
		
		System.out.println("Div answer is: "+c);
		
		System.out.println("Hello everyone");
		System.out.println("we will learn exceptions");
	}

}
