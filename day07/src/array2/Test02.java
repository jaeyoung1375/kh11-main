package array2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//문제 : 문자열 5개를 배열에 입력받아 출력
		
		String[] names = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
//		names = sc.next();
		
		System.out.print("이름 입력 : ");
		names[0] = sc.next();
		System.out.print("이름 입력 : ");
		names[1] = sc.next();
		System.out.print("이름 입력 : ");
		names[2] = sc.next();
		System.out.print("이름 입력 : ");
		names[3] = sc.next();
		System.out.print("이름 입력 : ");
		names[4] = sc.next();
		
		sc.close();
		
		System.out.println("이름 : " + names[0]);
		System.out.println("이름 : " + names[1]);
		System.out.println("이름 : " + names[2]);
		System.out.println("이름 : " + names[3]);
		System.out.println("이름 : " + names[4]);
		
	}
}
