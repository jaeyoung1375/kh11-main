package loop2;

import java.util.Scanner;

public class Test04_5 {
	public static void main(String[] args) {
		//숫자 모래성 게임
		
		int origin = 100;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int user = sc.nextInt();
			//만약 1~9 사이의 값이 아니면 다음 턴으로 바로 이동(continue)
			//if(user < 1 || user > 9) {
			if(!(user >= 1 && user <= 9)) {
				System.out.println("1~9 사이만 입력하세요");
				continue;
			}
			
			origin -= user;
			count++;
			//System.out.println("count = " + count);
			
			if(origin < 0) {
				break;
			}
			else {
				System.out.println("남은 숫자 : " + origin);
			}
		}
		
		sc.close();
		
		System.out.println("게임 오버");
		System.out.println("총 입력 횟수 : " + count);
		
	}
}







