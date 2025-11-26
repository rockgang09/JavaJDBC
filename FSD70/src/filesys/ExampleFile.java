package filesys;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExampleFile {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new file name: ");
		String fs = sc.nextLine();
		
		FileOutputStream fos = new FileOutputStream( fs+".txt");
		
		System.out.println("Enter data into a file");
		
		while(true) {
			
			String data = sc.nextLine();
			
			if(data.equalsIgnoreCase("exit")) {
				break;
				
			}
				data += "\n";
				byte [] b = data.getBytes();
				fos.write(b);
			}		
		fos.close();
		System.out.println("Data written into the file");
		
		
		FileInputStream fis = new FileInputStream(fs+".txt");
		
		byte [] b = fis.readAllBytes();
		
		String str = new String(b);
		
		System.out.println(str);
	}

}
