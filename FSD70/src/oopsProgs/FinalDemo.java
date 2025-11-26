package oopsProgs;

class Sprint{
	
	final int a = 100;
	int b = 200;
	
	final void show() {
		//int c = a + a;
		//a += a; you can't re-assign final data
		System.out.println("a value is: "+ a);
		//System.out.println("c value is: "+c);
	}
	
	final int show(int x,int y ) {
		return x+y;
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		
		Sprint f = new Sprint();
		f.show();
		System.out.println(f.show(3, 9));
	}

}
