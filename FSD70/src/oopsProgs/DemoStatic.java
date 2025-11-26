package oopsProgs;

class Talent{
	static int a = 0;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	void show()
	{
		a++;
		System.out.println("a value is "+ a);
	}
}

public class DemoStatic {

	public static void main(String[] args) {
		Talent t = new Talent();
		Talent y = new Talent();
		
		t.show(); 
		y.show();

	}

}
