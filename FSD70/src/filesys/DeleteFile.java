package filesys;

import java.util.Scanner;
import java.io.*;

public class DeleteFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File name to delete: ");
		String s = sc.nextLine();
		File f = new File(s+".txt");
		if(!f.exists()) {
			System.out.println("File not exists ");
		}	
		else{
			f.delete();
			System.out.println("File deleated successfully");
		}

		sc.close();
	}

}
