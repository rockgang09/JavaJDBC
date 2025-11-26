package thread;

public class DemoRunnableThread implements Runnable {

	public static void main(String[] args) {
		DemoRunnableThread t = new DemoRunnableThread();
		
		
		Thread s = new Thread(t);
		
		System.out.println(Thread.currentThread());
		
		s.setName("Saif");
		
		System.out.println(s.getName());
		
		
		System.out.println(s.getPriority());
		System.out.println(s.getThreadGroup());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


}
