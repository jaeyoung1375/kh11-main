package oop.keyword5;

public class Test01 {
	public static void main(String[] args) {
//		Account.setBaseRate(1.5);
//		System.out.println(Account.getBaseRate());
		
		Account a1 = new Account("유재석", 0.3, 5000000);
		Account a2 = new Account("강호동", 0.5, 3500000);
		Account a3 = new Account("신동엽", 0.2, 8000000);
		
		a1.output();
		a2.output();
		a3.output();
	}
}
