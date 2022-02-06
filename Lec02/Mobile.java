package Lec02;

public class Mobile {
	
	// Attributes
	String make;
	String model;
	String version;
	double price;
	
	static String store;
	
	// Constructor
	public Mobile(String make, String model, String version) {
		this.make = make;
		this.model = model;
		this.version = version;
	}
	
	
	// Methods
	public void print() {
		System.out.println(this.make + " " + this.model + " " + this.version + "(" + this.price + " SAR)");
	}
	
	public void changePrice(double newPrice) {
		this.price = newPrice;
	}
	
	public static void printStoreName() {
		System.out.println(store);
	}

}
