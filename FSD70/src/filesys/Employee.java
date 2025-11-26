package filesys;

import java.io.Serializable;

public class Employee implements Serializable {
	private String name;
	private int empId;
	private double salary;
	
	public Employee(String name, int empId, double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}





	public static void main(String[] args) {

	}

}
