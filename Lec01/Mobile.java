package Lec01;

public class Mobile {
	
	String make;
	String model;
	String version;
	double price;
	
	public void print() {
		System.out.println(make + " " + model + " " + version + "(" + price + " SAR)");
	}
	
	public void changePrice(double newPrice) {
		price = newPrice;
	}

}
