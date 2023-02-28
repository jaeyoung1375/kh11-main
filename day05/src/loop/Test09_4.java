package loop;

import java.util.Scanner;

public class Test09_4 {
	public static void main(String[] args) {
		
		//성능 개선 1탄 - 1과 자기자신을 제거
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int number = sc.nextInt();
		sc.close();
		
		int count = 0;
		
		//처리
		for(int i=2; i<number; i++) {
			System.out.println(i+"로 나눈 나머지 = " + number % i);
			if(number % i == 0) {
				count++;
			}
		}
		
		System.out.println("나누어 떨어지는 숫자 개수 = " + count);
		
		//출력
		if(count == 0) {
			System.out.println(number+" : 소수입니다");
		}
		else {
			System.out.println(number+" : 소수가 아닙니다");
		}
		
	}
}
