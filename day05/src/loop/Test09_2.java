package loop;

public class Test09_2 {
	public static void main(String[] args) {
		
		//입력
		int number = 6;
		
		int count = 0;
		
		//처리
		for(int i=1; i<=number; i++) {
			if(number % i == 0) {
				//System.out.println(number % i);
				count++;
			}
		}
		
		System.out.println("count = " + count);
		

		//출력
		if(count == 2) {
			System.out.println(number+" : 소수입니다");
		}
		else {
			System.out.println(number+" : 소수가 아닙니다");
		}
		
	}
}
