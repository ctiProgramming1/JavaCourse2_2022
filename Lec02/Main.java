package Lec02;

public class Main {

	public static void main(String[] args) {
		
		/////// Persons
		
		Person p10 = new Person("Ali");
		p10.print_info();
		p10.age = 20;
		p10.address = "Mecca";
		p10.print_info();
		
		Person p20 = new Person("Khaled", 22, 'm', "Strudent", "Riyadh");
		p20.address = "Jeddah";
		p20.print_info();
		

//		//////////////////////////////////////////////////
//		//// CAR CLASS //////////////////////////////////
//		
		Car c1 = new Car("Toyota","Camry",2018,"White");
		c1.print();

		Car c2 = new Car("Ford","Explorer",2020,"Blue");		
		c2.color = "Black";
		c2.print();
			
		Car c3 = new Car("Ford","Taourse",2021,"White");
		c3.print();
//		
//		////////////////////////////////////////////////////
//		//// Mobile CLASS //////////////////////////////////	
//
		Mobile m1 = new Mobile("Apple", "iPhone", "13");
		m1.print();
		
		m1.changePrice(2500);		
		m1.print();
		
		m1.version = "12";
		m1.print();
		
		Mobile.store  = "ABC Electroics";
		Mobile.printStoreName();
		
		

	}

}






