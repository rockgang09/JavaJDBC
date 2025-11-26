package oopsProgs;

class A{
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
}

class B extends A{
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
}

class C extends B{
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "A [from c " + a + "]";
	}
	
}
public class DemoMultiLvl {

	public static void main(String[] args) {
		C obj = new C();
		obj.setA(5);
		
		System.out.println(obj);
		
		
	}

}
