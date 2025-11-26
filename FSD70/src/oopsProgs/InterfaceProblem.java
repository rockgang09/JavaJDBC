package oopsProgs;


interface Services{
	
	void bookRide(String Source, String destination);
	void calculateFare(double distance);
	void startRide();
	void endRide();
}


class CarRide implements Services{
	final double basefare = 25.69;
	
	public void bookRide(String Source, String destination) {
		
		System.out.println("Your Car booking confirmed from "+Source+"to"+destination);
	}
	
	public void calculateFare(double distance) {
		System.out.println("Your total fare is: "+ (distance*basefare));
	}
	
	public void startRide() {
		System.out.println("Started");
	}
	
	public void endRide() {
		System.out.println("Ended");
	}
	
}

class BikeRide{
	
final double basefare = 15.69;
	
	public void bookRide(String Source, String destination) {
		
		System.out.println("Your Bike booking confirmed from "+Source+" to "+destination);
	}
	
	public void calculateFare(double distance) {
		System.out.println("Your total fare is: "+ (distance*basefare));
	}
	
	public void startRide() {
		System.out.println("Started");
	}
	
	public void endRide() {
		System.out.println("Ended");
	}
	
}

class AutoRide{
	
final double basefare = 20.69;
	
	public void bookRide(String Source, String destination) {
		
		System.out.println("Your Auto booking confirmed from "+Source+"to"+destination);
	}
	
	public void calculateFare(double distance) {
		System.out.println("Your total fare is: "+ (distance*basefare));
	}
	
	public void startRide() {
		System.out.println("Started");
	}
	
	public void endRide() {
		System.out.println("Ended");
	}
	
}



public class InterfaceProblem {

	public static void main(String[] args) {
		
		BikeRide b = new BikeRide();
		
		b.startRide();
		b.bookRide("amberpet", "madhapur");
		b.calculateFare(20);
		b.endRide();

	}

}
