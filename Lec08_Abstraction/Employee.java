package Lec08_Abstraction;

/*
 * Abstraction التجريد
 * source: https://harmash.com/tutorials/java/abstraction
 */

public class Employee extends Person{
	int employee_id;
	
	public Employee(String name) {
		super(name);
	}
	
	public Employee(String name, int age, char gender, String job, String address) {
		super(name, age, gender, job, address);
	}

	@Override
	public void print_info() {
		System.out.println(name + "(" + age + " yesrs old): " + address + " " + employee_id);
	}

}
