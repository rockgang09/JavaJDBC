package basicProgs;

public class DemoMethods {
	
	public static void hello() {
		System.out.println("Hello");
	}
	
	public static int sum(int a, int b) {
		return (a+b);
	}
	
	public static void div(int a, int b) {
		System.out.println("div is "+ a/b);
	}
	
	public static int mul(int a, int b) {
		return (a*b);
	}
	
	
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		hello();
		System.out.println(sum(x,y));
		div(x,y);
		System.out.println(mul(x,y));
		
	}

}
 