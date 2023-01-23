package Constructors;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("12");
		
		p1.id = 11110001;
		
		Person p2 = new Person("Ali");

//		System.out.println(p1.name);
//		p1.print();
//		p2.print();
		
		Game game1 = new Game();
		
		game1.player1 = p1;
		game1.player2 = p2;
		
//		game1.print();
		
		Account account1 = new Account(10001,1000);
		account1.holder = p1;
		
		Account.bank_name = "R Bank";	
		
		account1.print_info();		
		account1.deposit(500);	
		account1.print_info();
		account1.withdrow(700);
		account1.print_info();
		
		
	}

}
