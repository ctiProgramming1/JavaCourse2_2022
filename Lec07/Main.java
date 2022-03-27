package Lec07;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ammar", 20, 'm', "Student", "Riyadh");
		
		p1.print();
		
		Student s1 = new Student("Ali", 19, 'm', "Student", "Jeddah", 1022230);
		
		s1.print();
		
		System.out.println(s1 instanceof  Person);		
		System.out.println(s1 instanceof  Student);		
		System.out.println(p1 instanceof  Person);
		System.out.println(p1 instanceof  Student);




	}

}
