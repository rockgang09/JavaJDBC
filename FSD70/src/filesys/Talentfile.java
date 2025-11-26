package filesys;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Talentfile {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		
		
		/*FileOutputStream fos = new FileOutputStream("Talent.txt");
		
		System.out.println("Enter data into a file");
		String data = sc.nextLine();
		
		byte [] b = data.getBytes();
		
		fos.write(b);
		
		System.out.println("Data written into the file");
		
		fos.close();*/
		
		FileInputStream fis = new FileInputStream("Talent.txt");
		
		byte [] b = fis.readAllBytes();
		
		String str = new String(b);
		
		System.out.println(str);
		
	}

}
