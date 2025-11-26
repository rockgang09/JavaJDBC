package oopsProgs;


class Bbatsman{
	private String name;
	private int runScored,centuries,halfcenturies,ballsfaced,fours,sixes;
	
	
	public Bbatsman() {
		
	}
	
	
	public Bbatsman(String n,int rs,int c,int hc,int bf,int f,int s) {
		name = n;
		runScored = rs;
		centuries = c;
		halfcenturies = hc;
		ballsfaced = bf;
		fours = f;
		sixes = s;	
	}
	
	float strikerate() {
		return (runScored/ballsfaced) * 100; 
	}
	
	int runscoredinboundaries() {
		return (4 * fours) + (6 * sixes);
	}
	
}



public class Batsman03 {

	public static void main(String[] args) {

	}

}
