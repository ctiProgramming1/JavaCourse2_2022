package Lab10_Polymorphism;

public class Square extends Shape{
	
	@Override
	public void area(double l) {
		
		System.out.println("The Square Area is " + Math.pow(l, 2) );
		
	}

}
