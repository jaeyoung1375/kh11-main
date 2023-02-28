package random;

import java.text.DecimalFormat;
import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		Random r = new Random();
		
//		1. 로또 번호 1개 (1부터 45 사이의 정수)
//		-> 1부터 45개
		int lotto = r.nextInt(45) + 1;
		System.out.println("로또 번호 : " + lotto);
		
		int lotto2 = r.nextInt(1, 46);//JDK 17+
		System.out.println("로또 번호 : " + lotto2);
		
//		2. 두 자리 정수 중 1개
//		-> 10부터 99까지 
//		-> 10부터 (99-10+1)개
//		-> 10부터 90개
		int number = r.nextInt(90) + 10;
		System.out.println("두 자리 정수 = " + number);
		
//		3. OTP 번호 1개 (6자리)
//		-> 100000 부터 999999 까지
//		-> 100000 부터 (999999 - 100000 + 1) 개
//		-> 100000 부터 900000 개
		int otp = r.nextInt(900000) + 100000;
		System.out.println("OTP 번호 = " + otp);
		
//		4. 동전을 던진 결과 출력(앞 또는 뒤)
//		- 범위를 알 수 없음
//		- 임의로 지정을 해야 함
//		- 1, 2로 지정하면 1부터 2개
//		- 0, 1로 지정하면 0부터 2개(사용)
		int coin = r.nextInt(2);
//		System.out.println("coin = " + coin);
		if(coin == 0) {
			System.out.println("앞");
		}
		else {
			System.out.println("뒤");
		}
		
//		5. 윷놀이 한 턴 결과 출력(도/개/걸/윷/모/빽도)
//		- 4번 방식으로 푼다면 도(0), 개(1), 걸(2), 윷(3), 모(4), 빽도(5)
//		- 0부터 6개
		int yut = r.nextInt(6);
		if(yut == 0) {
			System.out.println("도");
		}
		else if(yut == 1) {
			System.out.println("개");
		}
		else if(yut == 2) {
			System.out.println("걸");
		}
		else if(yut == 3) {
			System.out.println("윷");
		}
		else if(yut == 4) {
			System.out.println("모");
		}
		else {
			System.out.println("빽도");
		}		
	}
}








