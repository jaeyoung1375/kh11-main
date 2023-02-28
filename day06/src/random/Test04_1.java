package random;

import java.util.Random;

public class Test04_1 {
	public static void main(String[] args) {
		
		//입력
		int event1 = 1;//1번상품 당첨확률
		int event2 = 3;//2번상품 당첨확률 
		String item1 = "강남아파트 1채";//1번상품
		String item2 = "테슬라 1대";//2번상품
		
		//처리
		Random r = new Random();
		int choice = r.nextInt(100);
		System.out.println("choice = " + choice);

		//String item = "강남아파트 1채" or "테슬라 1대" or "다음 기회에";
		String item;
		if(choice < event1) {
			item = item1;
		}
		else if(choice < event1+event2) {
			item = item2;
		}
		else {
			item = "다음 기회에";
		}
		
		//출력
		System.out.println("추첨 결과 : " + item);
	}
}








