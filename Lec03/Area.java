package Lec03;

public final class Area {
	
	private Area(){	
	}
	
	public static void square(double length) {
		System.out.println(" The square area = " + Math.pow(length, 2));
	}

	public static void rectangle(double length, double width) {
		System.out.println(" The rectangle area = " + (length * width));
	}

	public static void circle(double r) {
		System.out.println(" The circle area = " + Math.PI * Math.pow(r, 2));
	}

}
