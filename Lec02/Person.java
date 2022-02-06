package Lec02;

public class Person {
	
	// Attributes
	String name;
	int age;
	char gender;
	String job;
	String address;
	
	// Constructor
	
	
	public Person(String n) {
		name = n;
	}
	public Person(String n, int a, char g, String j, String ad) {
		name = n;
		age = a;
		gender = g;
		job = j;
		address = ad;
	}
	
	
	// Methods
	
	public void print_info() {
		System.out.println(name + "(" + age + " yesrs old): " + address);
	}

}
