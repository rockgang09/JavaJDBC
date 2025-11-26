package filesys;
import java.io.*;

public class DisplayByPath {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\91809\\eclipse-workspacee\\FSD70");
		
		File[] files = f.listFiles();
		
		for(File file : files) {
			System.out.println(file.getName());
		}

	}

}
