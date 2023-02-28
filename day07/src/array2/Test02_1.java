package array2;

import java.util.Scanner;

public class Test02_1 {
	public static void main(String[] args) {
		//문제 : 문자열 5개를 배열에 입력받아 출력
		
		String[] names = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < names.length; i++) {
			System.out.print("이름 입력 : ");
			names[i] = sc.next();
		}
		
		sc.close();
		
		for(int i=0; i < names.length; i++) {
			System.out.println("이름 : " + names[i]);
		}
		
	}
}
