package Lec02;

public class Car {
	
	// Attributes
	String make;
	String model;
	int year;
	String color;
	
	// Constructor
	public Car(String make, String model, int year, String color) {
		this.make = make;
		this.model =model;
		this.year = year;
		this.color = color;
	}

	// Methods
	
	public void print() {
		System.out.println(year + " " + make + " " + model + " (" + color + ")");
	}

}
