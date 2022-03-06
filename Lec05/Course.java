package Lec05;

public class Course {
	
	int code;
	String name;
	int hours;
	
	public Course() {
		
	}
	
	public Course(int code, String name, int hours) {
		this.code = code;
		this.name = name;
		this.hours = hours;
	}
	
	public Course(String name) {
		this.name = name;
	}
	
	public Course(String name, int code) {
		this.name = name;
		this.code = code;
	}
	
	
	public void print() {
		System.out.println(code + " " + name + " " + hours + " hours");
	}
	

}
