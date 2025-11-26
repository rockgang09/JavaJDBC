package thread;



class Tg1 extends Thread{
	
	
	void t1() {
		
		System.out.println(getThreadGroup());
	}
	
	void t2() {
		System.out.println("T2");
	}
	
	void t3() {
		System.out.println("T3");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class Tg2{
	
	
	void t4() {
		System.out.println("T4");
	}
	
	void t5(int s) {
		System.out.println("T5");
	}
	
	
	void t6() {
		System.out.println("T6");
	}
	
	
}

public class ThreadProblem{

	public static void main(String[] args) {
		
		Tg1 p = new Tg1();
		
		p.t1();

	}

}
