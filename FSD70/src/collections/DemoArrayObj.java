package collections;

import java.util.ArrayList;

class Myobj{
	String name;

	Myobj(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Myobj [name=" + name + "]";
	}
	
	
}

public class DemoArrayObj {

	public static void main(String[] args) {
		
		ArrayList<Object> o = new ArrayList<>();
		
		o.add(99.9);
		o.add(true);
		o.add("Hello world");
		
		Myobj f = new Myobj("Fazil");
		
		o.add(f);
		
		
		System.out.println(o);
		
		for(Object s : o) {
			System.out.println(s);
		}
	}

}
