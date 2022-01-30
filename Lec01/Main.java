package Lec01;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person();		
		p1.name = "Ahmed";
		p1.age = 20;
		p1.job = "Student";
		p1.address = "Riyadh";
		p1.gender = 'm';		
		p1.print_info();
				
		Person p2 = new Person();
		p2.name = "Ali";
		p2.age = 19;
		p2.job = "Student";
		p2.address = "Jeddah";
		p2.print_info();
		
		Person p3 = new Person();
		p3.name = "Mohammed";
		p3.age = 21;
		p3.address = "Mecca";  
		p3.print_info();
		
		
		Person p4 = new Person();
		p4.name = "Khaled";
		p4.age = 22;
		p4.address = "Alkharj";
		p4.print_info();
				
		Person p5 = new Person();
		p5.name = "Ammar";
		p5.age = 20;
		p5.address = "Riyadh";
		p5.print_info();
		
		
		Person p6 = new Person();
		p6.name = "Adil";
		p6.address = "Riyadh";
		p6.age = 20;
		p6.print_info();
		
		
		
		//////////////////////////////////////////////////
		//// CAR CLASS //////////////////////////////////
		
		Car c1 = new Car();
		c1.make = "Toyota";
		c1.model = "Camry";
		c1.year = 2018;
		c1.color = "White";
		c1.print();
		
		
		Car c2 = new Car();
		c2.make = "Ford";
		c2.model = "Explorer";
		c2.year = 2020;
		c2.color = "Blue";
		c2.print();
		
		
		Car c3 = new Car();
		c3.make = "Ford";
		c3.model = "Taourse";
		c3.year = 2021;
		c3.color = "White";
		c3.print();
		
		////////////////////////////////////////////////////
		//// Mobile CLASS //////////////////////////////////	

		Mobile m1 = new Mobile();
		m1.make = "Apple";
		m1.model = "iPhone";
		m1.version = "13";
		m1.price = 3000;
		
		m1.print();
		
		m1.changePrice(2500);
		
		m1.print();
		
		m1.version = "12";
	}

}






