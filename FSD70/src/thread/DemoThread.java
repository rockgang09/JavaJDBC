package thread;

public class DemoThread extends Thread {

	public static void main(String[] args) {
		DemoThread t = new DemoThread();
		DemoThread s = new DemoThread();
		
		
		System.out.println(Thread.currentThread());
		
		t.setName("Fazil");
		s.setName("Saif");
		
		System.out.println(t.getName());
		System.out.println(s.getName());
		
		t.setPriority(8);
		
		System.out.println(t.getPriority());
		System.out.println(s.getPriority());
		System.out.println(t.getThreadGroup());
	}

}
