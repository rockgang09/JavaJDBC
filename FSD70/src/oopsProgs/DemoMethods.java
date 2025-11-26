package oopsProgs;


class ArthimeticOperations{//method Overloading
	
	int a;
	
	public void setA(int n) {
		a = n;
	}
	
	public int sum(int x, int y) {
		return x+y;
	}
	
	public int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	public double sum(double x, int y) {
		return x+y;
	}
	
	public String sum(String x,String y) {
		return x+y;
	}
	
	public int sum(ArthimeticOperations o1,ArthimeticOperations o2) {
		return (o1.a + o2.a);
	}
	
}


public class DemoMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArthimeticOperations obj = new ArthimeticOperations();
				
		
		System.out.println("Adding nums "+ obj.sum(5, 9));
		System.out.println("Adding decimal nums "+ obj.sum(2.5, 5));
		
		
				
		ArthimeticOperations obj1 = new ArthimeticOperations();
		ArthimeticOperations obj2 = new ArthimeticOperations();
		
		
		obj1.setA(5);
		obj2.setA(8);
		
		System.out.println("Adding objs values "+ obj.sum(obj1, obj2));
	}

}
