package oop.keyword2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String password = sc.next();
		sc.close();
		
		Member m = new Member(id, password);
		m.output();
	}
}
