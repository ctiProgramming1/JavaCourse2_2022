package Lec06;

public class Employee extends Person{
	int employee_id;
	
	public Employee(String name) {
		super(name);
	}
	
	public Employee(String name, int age, char gender, String job, String address) {
		super(name, age, gender, job, address);
	}

	

}
