package oopsProgs;


class Batsman{
	String name;
	int runScored,centuries,halfcenturies,ballsfaced,fours,sixes;
	
	
	void setData(String n,int rs,int c,int hc,int bf,int f,int s) {
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



public class BatsmanOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Batsman fazil = new Batsman();
		
		fazil.setData("Fazil", 669, 2, 4, 469, 50, 40);
		
		System.out.println(fazil.strikerate());
		
		System.out.println(fazil.runscoredinboundaries());
		
		
		Batsman ganesh = new Batsman();
		
		ganesh.setData("Ganesh", 1069, 4, 6, 400, 50, 60);
		
		System.out.println("Strike rate : "+ganesh.strikerate());
	}

}
