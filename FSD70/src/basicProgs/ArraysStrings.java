package basicProgs;
import java.util.*;

public class ArraysStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		String s[] = new String[size];
		
		for(int i = 0; i < size; i++) {
			s[i] = sc.next();
		}
		
		Arrays.sort(s);
		System.out.println(s);
		
		
		for(String j : s) {
			System.out.println(j);
		}
		
		
		
		System.out.println("Enter a string to find in array");
		String dup = sc.next();
		int search = Arrays.binarySearch(s, dup);
		System.out.println(search);
		
	}

}
