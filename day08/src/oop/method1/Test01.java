package oop.method1;

public class Test01 {
	public static void main(String[] args) {
		Plan p1 = new Plan();
		Plan p2 = new Plan();
		Plan p3 = new Plan();
		
		p1.setting("SK", "5G언택트 52", 52000, 200, 1000, 2000);
		p2.setting("KT", "5G세이브", 45000, 100, 900, 1500);
		p3.setting("LG", "5G시그니처", 130000, 500, 2000, 2500);
		
		p1.output();
		p2.output();
		p3.output();
	}
}
