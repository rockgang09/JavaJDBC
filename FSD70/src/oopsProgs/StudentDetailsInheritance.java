package oopsProgs;


class Marks{
	private int m,p,c;
	private double tot,avg;
	
	void setMaeks(int m,int p,int c) {
		this.m = m; this.p = p; this.c = c;
	}
	
	void getMarks() {
		tot = m + p + c;
		avg = tot / 3;
		
		System.out.println(tot+"  "+avg);
	}
}

class Stud extends Marks{
	int sid,age;
	String name;
	
	
	public Stud(int sid, int age, String name) {
		this.sid = sid;
		this.age = age;
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Stud [sid=" + sid + ", age=" + age + ", name=" + name + "]";
	}
	
	
	
	
}

public class StudentDetailsInheritance {

	public static void main(String[] args) {
		
		Stud s1 = new Stud(69, 22, "Fazil");
		
		System.out.println(s1);
		
		s1.setMaeks(67, 79, 99);
		s1.getMarks();


	}

}
