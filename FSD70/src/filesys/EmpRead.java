package filesys;

import java.io.*;

public class EmpRead {


	public static void main(String[] args) {
		
		try(FileInputStream fos = new FileInputStream("employee.dat")){
			ObjectInputStream oos = new ObjectInputStream(fos);
			
			
			while (true) {
				try {
					Employee emp = (Employee) oos.readObject();
					System.out.println("Read from file: " + emp);
            
			} 
				catch (EOFException e) {
					break;
            }
		}
			
			
		}
		catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
