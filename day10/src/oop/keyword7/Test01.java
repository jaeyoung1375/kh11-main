package oop.keyword7;

public class Test01 {
	public static void main(String[] args) {
		
		int a = Calculator.square(11);
		System.out.println("a = " + a);
		
		int b = Calculator.square(11, 2);
		System.out.println("b = " + b);
		
		double c = Calculator.bmi(180, 80);
		System.out.println("c = " + c);
		
		int d = Calculator.subway(1999);
		System.out.println("d = " + d);
		
		double e = Calculator.triangle(5, 7);
		System.out.println("e = " + e);
		
		double f = Calculator.circle(7);
		System.out.println("f = " + f);
		
	}
}











