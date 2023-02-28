package loop2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//while을 쓰면 좋은 상황
		//- ex : 0을 입력할 때까지 숫자를 계속해서 입력받는 프로그램
		//- 횟수를 특정할 수 없지만 종료시점이나 실행조건은 명확한 경우
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자 입력");
			int n = sc.nextInt();
			
			if(n == 0) {//0이 입력되었다면
				break;//반복 중지
			}
		}
		
		sc.close();
		
	}
}
