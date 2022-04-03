package Lec08_Abstraction;

/*
 * Abstraction التجريد
 * source: https://harmash.com/tutorials/java/abstraction
 */

public abstract class Person {

	// Attributes
	String name;
	int age;
	char gender;
	String job;
	String address;

	// Constructor

	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age, char gender, String job, String address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.job = job;
		this.address = address;
	}


	// Methods

	public abstract void print_info();

}