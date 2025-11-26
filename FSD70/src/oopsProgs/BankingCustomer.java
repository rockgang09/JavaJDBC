package oopsProgs;

class CustomerDetails{
	private String Customer_name, Account_type;
	private long AccNo;
	protected double amount;
	

	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	public String getAccount_type() {
		return Account_type;
	}
	public void setAccount_type(String account_type) {
		Account_type = account_type;
	}
	public long getAccNo() {
		return AccNo;
	}
	public void setAccNo(long accNo) {
		AccNo = accNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public CustomerDetails(String Customer_name, String Account_type, long AccNo, double amount) {
		this.Customer_name = Customer_name;
		this.Account_type = Account_type;
		this.AccNo = AccNo;
		this.amount = amount;
		
	}
	
	void withdraw(int amt) {
		if(amt > 500 && amt <= amount) {
			System.out.println("minimun withdrawal 500");
		}
		
		else {
			System.out.println("After withdraw total balance: "+ (amount = amount-amt));
		}
	}
	
	void deposit(int amt) {
		System.out.println("Deposited Successfully: "+(amount = amount + amt));
	}
	@Override
	public String toString() {
		return "CustomerDetails [Customer_name=" + Customer_name + ", Account_type=" + Account_type + ", AccNo=" + AccNo
				+ ", amount=" + amount + "]";
	}
	
}

class Savings extends CustomerDetails{
	
	
	public Savings(String Customer_name, String Account_type, long AccNo, double amount) {
		super(Customer_name, Account_type, AccNo, amount);
	}


	void intrest() {
		if(amount < 500) {
			System.out.println("No intrest can be added to your Account");
		}
		else {
			amount = amount * 1.03;
			System.out.println("intrest Added Successfully: " + amount);
		}
	}
	
}

class Currrent extends CustomerDetails{
	
	public Currrent(String Customer_name, String Account_type, long AccNo, double amount) {
		super(Customer_name, Account_type, AccNo, amount);
	}

	void intrest() {
		if(amount < 1000) {
			System.out.println("No intrest can be added to your Account");
		}
		else {
			amount = amount * 1.05;
			System.out.println("intrest Added Successfully: " + amount);
		}
	}
}

class FixedDeposit extends CustomerDetails{
	
	int time;

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public FixedDeposit(String Customer_name, String Account_type, long AccNo, double amount) {
		super(Customer_name, Account_type, AccNo, amount);
	}
	
	
	void intrest() {
		if(time == 5) {
			amount = amount * 1.05;
			System.out.println("After "+ time +" years your amount will be: "+ amount);
		}
		
		else if(time == 10) {
			amount = amount * 1.1;
			System.out.println("After "+ time +" years your amount will be: "+ amount);
		}
		
		else {
			System.out.println("For this tenure no fd are avaliable");
		}
	}
	
}




public class BankingCustomer {

	public static void main(String[] args) {

//		CustomerDetails c1 = new CustomerDetails("Fazil", "Savings", 669448833, 66669.99);
//		c1.deposit(500);
//		c1.withdraw(1000);
		
		
		Savings s = new Savings("Fazil", "Savings", 554663728, 99999);
		s.intrest();
		System.out.println(s);
		System.out.println();
		
		Savings c = new Savings("Fazil", "Current", 554663728, 999);
		c.deposit(10000);
		c.intrest();
		System.out.println(c);
		
		System.out.println();
		
		FixedDeposit f1 = new FixedDeposit("Fazil", "FD", 667755443, 100000);
		
		f1.setTime(5);
		f1.intrest();
		
		System.out.println(f1);

	}

}
