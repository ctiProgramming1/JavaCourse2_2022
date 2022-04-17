/*
 * Lab 10: Java Polymorphism : Perform a single action (method) in different ways
 * 
 * source 1: https://harmash.com/tutorials/java/polymorphism
 * source 2: https://www.w3schools.com/java/java_polymorphism.asp
 */

package Lec10_Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		Shape square = new Square();
		
		circle.area(3);
		square.area(5);
		
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		System.out.println(circle instanceof Square);

		System.out.println(square instanceof Shape);
		System.out.println(square instanceof Circle);
		System.out.println(square instanceof Square);
		
	}

}
