package filesys;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferFile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("Talent.txt"));
		
		String n = br.readLine();
		
		System.out.println(n);
	}

}
  