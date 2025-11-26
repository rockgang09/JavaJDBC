package oopsProgs;


class Employee{
	private String ename;
	private int eid;
	private double esalary;
	
	public Employee(String ename, int eid, double esalary) {
		this.ename = ename;
		this.eid = eid;
		this.esalary = esalary;
	}

	public Employee(double esalary) {
		this.esalary = esalary;
	}

	public Employee(String ename, int eid) {
		this.ename = ename;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", esalary=" + esalary + "]";
	}
}

public class DemoEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("Fazil",101);
		System.out.println(emp1);
		
		System.out.println(new Employee("Ali",169,50000));

	}

}
