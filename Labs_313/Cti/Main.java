package Cti;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.name = "Khaled";
		p1.id = 11110001;
		
		Person p2 = new Person();
		p2.name = "Ali";
		
//		System.out.println(p1.name);
//		p1.print();
//		p2.print();
		
		Game game1 = new Game();
		
		game1.player1 = p1;
		game1.player2 = p2;
		
//		game1.print();
		
		Account account1 = new Account();
		account1.holder = p1;
		account1.account_id = 10001;
		account1.balance = 1000;
		
		account1.print_info();		
		account1.deposit(500);	
		account1.print_info();
		account1.withdrow(700);
		account1.print_info();
		
		
	}

}
