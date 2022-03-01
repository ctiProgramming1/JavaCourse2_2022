package Lec04;

public class Main {

	public static void main(String[] args) {
		
		Product mobile = new Product("iPhone", 2000, 10);
		
		mobile.print();
		
		mobile.buy();
		mobile.buy();
		
		mobile.print();
		
		System.out.println(mobile.getCurrenBlance());
		
		

		
	}

}
