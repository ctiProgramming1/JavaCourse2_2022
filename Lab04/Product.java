package Lab04;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	private double balance;

	public double getBalance() {
		return balance;
	}
	
	public String getCurrenBlance() {
		return "Current balance: SAR " + balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void buy() {
		this.quantity = this.quantity - 1;
		this.balance = this.balance + this.price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void print() {
		System.out.println(name + " SAR " + price + ": " + quantity + " device");
	}

}
