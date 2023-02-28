package random;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		
		//입력
		
		//처리
		Random r = new Random();
		int choice = r.nextInt(100);
		System.out.println("choice = " + choice);

		//String item = "강남아파트 1채" or "테슬라 1대" or "다음 기회에";
		String item;
		if(choice < 1) {
			item = "강남아파트 1채";
		}
		else if(choice < 4) {
			item = "테슬라 1대";
		}
		else {
			item = "다음 기회에";
		}
		
		//출력
		System.out.println("추첨 결과 : " + item);
	}
}








