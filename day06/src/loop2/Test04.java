package loop2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//숫자 모래성 게임
		
		int origin = 100;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int user = sc.nextInt();
		
		origin -= user;
		System.out.println("남은 숫자 : " + origin);
		
		sc.close();
		
	}
}







