package collections;

import java.util.HashSet;
import java.util.LinkedList;

class Employee{
	int empid;
	String ename;
	
	
	Employee(String ename,int empid){
		this.empid = empid;
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}
	
	
}

public class Problem {

	public static void main(String[] args) {
		
		
		LinkedList<Employee> emp = new LinkedList<>();
		
		Employee e1 = new Employee("Fazil", 1);
		Employee e2 = new Employee("suraj", 2);
		Employee e3 = new Employee("surya", 3);
		Employee e4 = new Employee("venkat", 4);
		Employee e5 = new Employee("venkat", 4);
		Employee e6 = new Employee("venkat", 4);
		Employee e7 = new Employee("venkat", 4);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		
		System.out.println(emp);
		
		
		emp.remove(e5);
		
		System.out.println(emp);
		
		
		
		Employee e8 = new Employee("venjat", 4);
		
		emp.set(3, e8);
		
		System.out.println(emp);
		
		
		HashSet<Employee> empp = new HashSet<Employee>(emp);
	//	System.out.println();
		
		System.out.println(empp);
		
		
		
		
	}

}
