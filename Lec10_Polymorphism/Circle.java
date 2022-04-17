package Lec10_Polymorphism;

public class Circle extends Shape{
	
	@Override
	public void area(double l) {
		
		System.out.println("The Circle Area is " + (Math.PI * Math.pow(l, 2)));
		
	}

}
