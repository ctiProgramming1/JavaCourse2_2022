package Lec05;

public class Main {
	
	public static void print(String name) {
		System.out.print("Name: " +name);
	}
	
	public static void print(String firstName, String lastName) {
		System.out.print("Full Name: " +firstName + " " + lastName);
	}
	
	
	// Main 

	public static void main(String[] args) {
		
		
		String name1 = "Ali";
		String name2 = "Khaled";
		
		print(name1);
		
		System.out.println();
		
		print(name1, name2);
		
		
		Course c1 = new Course();
		Course c2 = new Course("Network");
		Course c3 = new Course("Programming",101);
		c3.hours = 4;
		
		Course c4 = new Course(102, "Mobile develpment", 4);
		Course c5 = new Course(104, "Programming", 4);
		
		c1.print();
		c2.print();
		c3.print();
		c4.print();
		c5.print();

	}
}
