package oopsProgs;

class Banking{
	private int Ac_number; //global variables
	private String Customer_name; //global variables
	private double Amount; //global variables	
	
	public int getAc_number() {
		return this.Ac_number;
	}



	public void setAc_number(int Ac_number) {
		this.Ac_number = Ac_number;
	}



	public String getCustomer_name() {
		return this.Customer_name;
	}



	public void setCustomer_name(String Customer_name) {//local variables
		this.Customer_name = Customer_name;
	}



	public double getAmount() {
		return this.Amount;
	}



	public void setAmount(double Amount) { //local variables
		this.Amount = Amount;
	}

	
	@Override
	public String toString() {
		return "Banking [Ac_number=" + Ac_number + ", Customer_name=" + Customer_name + ", Amount=" + Amount + "]";
	}



	public void Deposit(double amt) {
		Amount+=amt;
	}
	
	
	public void Withdraw(double amt) {
		
		if(amt >= Amount) {
			System.out.println("Balance insufficient");
		}
			
		else {
			Amount -= amt;}
	}
	
	
	public double DisplayBalance() {
		return Amount;
	}
}




public class DemoStudents {

	public static void main(String[] args) {
		
		Banking b1 = new Banking();
		
		b1.setAc_number(112233455);
		b1.setCustomer_name("Fazil");
		b1.setAmount(1000);
				
		b1.Deposit(200.5);
		b1.Withdraw(200.75);
		
		System.out.println(b1.DisplayBalance());
		System.out.println(b1);
		
		
	}

}
