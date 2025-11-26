package collections;
import java.util.*;

public class DemoArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<>();
		
		s.add("Fazil");
		s.add("surya");
		s.add("suraj");
		s.add("venkat");
		s.add("venkat");
		
		System.out.println(s);
		
		
		for(String c : s) {
			System.out.println(c);
		}
		
		for(int i = 0; i < s.size();i++) {
			System.out.println(s.get(i));
		}
		
		s.reversed();
		System.out.println(s);
		
		System.out.println("updating values using set");
		s.set(3, "suraj");
		System.out.println(s);
		
		System.out.println("Using lambda");
		s.forEach(i -> System.out.println(i));

		
		System.out.println("Iterator");
		
		Iterator<String> iterator = s.iterator();
		
		while(iterator.hasNext()) {
			String names = iterator.next();
			System.out.println(names);
		}
		
		s.remove(1);
		System.out.println(s);
		
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Guava");
		fruits.add("Guava");
		
		fruits.addAll(s);
		

		
		System.out.println(fruits.reversed());
		
		
		
	}

}
