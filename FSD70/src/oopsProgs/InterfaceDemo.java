package oopsProgs;

interface Vehicle{
	void start();
	void stop();
	void accelarate();
}

interface Gps{
	
	int speed = 100;
	void tracklocation();
	void navigate(String destination);
	
}


class Car implements Vehicle,Gps{
	
	public void start() {
		System.out.println("Car is started");
	}
	
	public void accelarate() {
		System.out.println("car started accelerating..");
	}
	
	public void tracklocation() {
		System.out.println("Tracking location started");
	}
	
	public void navigate(String destination) {
		System.out.println("navigation started to: "+ destination);
	}
	
	public void stop() {
		System.out.println("Car reached to location and stopped..");
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		
		c.start();
		c.accelarate();
		c.tracklocation();
		c.navigate("Hyderabad");
		System.out.println("reached destination at speed of: "+Car.speed);
		c.stop();
	

	}

}
