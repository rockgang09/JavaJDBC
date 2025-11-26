package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class DemoArray1 {

	public static void main(String[] args) {
		
		int[] num = {11,32,9,54,25};
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		
		int se = 54;
		
		int index = Arrays.binarySearch(num, se);
		
		System.out.println(index);
		
		
//		Arrays.fill(num, 20);
//		System.out.println(Arrays.toString(num));
		
		int[] copynum = Arrays.copyOf(num, num.length);
		System.out.println(Arrays.toString(copynum));
		
		
		String[] names = {"Fazil","Suraj","Surya","Venkat"};
		
		String stringname = Arrays.toString(names);
		System.out.println(stringname);
		
		for(String name : names) {
			System.out.println(name);
		}
		
		for(int i = 0; i< names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		for(int i = names.length - 1; i >= 0; i--) {
			System.out.println(names[i]);
		}
		
		
	}

}
