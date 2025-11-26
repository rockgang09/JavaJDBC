package basicProgs;

import java.util.Scanner;

public class TdimensionArrray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[2][2];
		
//		int arr[][] = {{10,22},{22,33,44},{10},{24,54,32}};  
		
		for(int k = 0; k < arr.length; k++) {
			for(int l = 0; l < arr[k].length; l++) {
				arr[k][l] = sc.nextInt();
			}
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			int pc = 1;
			int pr = 1;
			
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
				pr *= arr[i][j];
			}
			
			System.out.print(" "+pr);
			System.out.println();
			
			for(int k = 0; k < arr.length  ; k++) {
				pc *= arr[k][i];	
			}
			System.out.println("col "+pc);
		}
		
		
		System.out.println(arr[1][1]);

	}

}