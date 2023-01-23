package Constructors;

public class Person {
	
	// Attributes
	String name;
	int id;
		
	// Constructors
	
	public Person(String name) {
		this.name = name.toUpperCase();
	}
	
	// Methods
	public void print() {
		System.out.println(name + " " + id);
	}
}
