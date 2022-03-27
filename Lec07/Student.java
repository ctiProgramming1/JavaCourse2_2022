package Lec07;

public class Student extends Person{
	
	int student_id;
	
	public Student(String name) {
		super(name);
	}
	
	public Student(String name, int age, char gender, String job, String address) {
		super(name, age, gender, job, address);
	}
	
	public Student(String name, int age, char gender, String job, String address, int student_id) {
		super(name, age, gender, job, address);
		this.student_id = student_id;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Student ID: " + student_id);
		
	}
	
	public void print_gpa() {
		
	}


}
