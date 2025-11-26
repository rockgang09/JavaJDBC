package filesys;

import java.io.*;

public class EmpWrite {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Fazil",1,25000.0);
		Employee emp2 = new Employee("Ahamed",2,35000.0);
		

		try(FileOutputStream fos = new FileOutputStream("employee.dat",true)){
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(emp1);
			oos.writeObject(emp2);
			
			System.out.println("Employee object written into file");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
