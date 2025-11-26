package oopsProgs;


class Batsmano{
	private String name;
	private int runsScored;
	private int centuries,halfcenturies,ballsfaced,fours,sixes;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public int getHalfcenturies() {
		return halfcenturies;
	}

	public void setHalfcenturies(int halfcenturies) {
		this.halfcenturies = halfcenturies;
	}

	public int getBallsfaced() {
		return ballsfaced;
	}

	public void setBallsfaced(int ballsfaced) {
		this.ballsfaced = ballsfaced;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	void setdata(String name, int runsScored, int centuries, int halfcenturies,int ballsfaced, int fours, int sixes) {
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfcenturies = halfcenturies;
		this.ballsfaced = ballsfaced;
		this.fours = fours;
		this.sixes = sixes;
	}
	
	float strikerate() {
		return (runsScored/ballsfaced) * 100; 
	}
	
	int runscoredinboundaries() {
		return (4 * fours) + (6 * sixes);
	}
	
	
	
}


public class Batsman02 {

	public static void main(String[] args) {
		
		Batsmano kohili = new Batsmano();
		
		kohili.setName("Kohili");
		kohili.setCenturies(269);
		kohili.setRunsScored(9999);
		
		System.out.println("Name of player is:  "+kohili.getName());
		
		
		
	}

}
