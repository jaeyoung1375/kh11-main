package loop;

public class Test09_1 {
	public static void main(String[] args) {
		
		//입력
		int number = 125;
		
		//처리
		for(int i=1; i<=number; i++) {
			if(number % i == 0) {
				System.out.println(number % i);
			}
		}
		

		//출력
//		if(???) {
			System.out.println(number+" : 소수입니다");
//		}
//		else {
			System.out.println(number+" : 소수가 아닙니다");
//		}
		
	}
}
