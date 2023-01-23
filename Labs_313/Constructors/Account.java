package Constructors;

public class Account {
	
	Person holder = new Person("");
	int account_id;
	double balance;
	static String bank_name = "ABC Bank";
	
	
	public Account(Person holder, int account_id, double balance) {
		this.holder = holder;
		this.account_id = account_id;
		this.balance = balance;
	}
		
	public Account(int account_id, double balance) {
		int a = 6;
		this.account_id = account_id;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdrow(double amount) {
		balance = balance - amount;
	}
	
	public void print_info() {
		System.out.println(holder.name + " " + account_id + " SAR " + balance);
	}
	

}
