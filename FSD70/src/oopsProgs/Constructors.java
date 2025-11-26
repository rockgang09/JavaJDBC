package oopsProgs;


class Cons{
	int a, b;
	String name;
	Cons(){
		System.out.println("From default cons");
	}
	
	Cons(int a,int b){
		this.a = a; this.b = b;
	}
	
	Cons(String name){
		this.name = name;
	}
	
	void display() {
		System.out.println("a and b values"+ a + " "+ b + " "+ name);
	}
}


public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cons n1 = new Cons();
		Cons n2 = new Cons(22 , 44);
		n2.display();
		
		Cons n3 = new Cons("Fazil");
		n3.display();

	}

}
