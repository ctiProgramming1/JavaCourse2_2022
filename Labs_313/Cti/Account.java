package Cti;

public class Account {
	
	Person holder = new Person();
	int account_id;
	double balance;
	
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
