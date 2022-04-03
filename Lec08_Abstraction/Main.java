package Lec08_Abstraction;

/*
 * Abstraction التجريد
 * source: https://harmash.com/tutorials/java/abstraction
 */

public class Main {

	public static void main(String[] args) {
		
		Student s = new Student("Ali");		
		s.student_id = 10002;
		
		System.out.println(s.name);
		
		Employee e = new Employee("Khaled");
		
		Student s2 = new Student("Fahad", 20, 'm', "Student", "Riyadh");
		Student s3 = new Student("Saad", 19, 'm', "Student", "Jeddah", 10002);
		
		s2.print_info();

	}

}
