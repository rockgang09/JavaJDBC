package filesys;

import java.io.*;
import java.util.Scanner;

public class CopyDataFileToFile {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source file name: ");
		String target = sc.nextLine();
		File source = new File(target+".txt");
		if(!source.exists()) {   
			System.out.println("Target Not Exists");
			return;
		}
		System.out.println("Enter destination file name: ");
		String attack = sc.nextLine();
		
		
		
		try {
			FileInputStream fis = new FileInputStream(target+".txt");
			FileOutputStream fos = new FileOutputStream(attack+".txt",true);
			byte [] b = fis.readAllBytes();
			
			fos.write(b);
			
			fis.close();
			fos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
