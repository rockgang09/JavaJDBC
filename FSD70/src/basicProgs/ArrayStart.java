package basicProgs;
import java.util.*;

public class ArrayStart {

	public static void main(String[] args) {
//		int n [] = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size od array");
		int s = sc.nextInt();
		
		int arr[] = new int[s];
		
		for(int j = 0; j < s; j++) {
			arr[j] = sc.nextInt();
		}
		
		for(int i = 0; i < s; i++) {
			System.out.println("n["+i+"]"+" = "+ arr[i]);
		}
		
		
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.println("Sorted array"+i);
		}
		
		System.out.println("Enter number to find");
		int binary = Arrays.binarySearch(arr, sc.nextInt());
		System.out.println(binary >= 0 ? binary : "not found" );

	}
}
