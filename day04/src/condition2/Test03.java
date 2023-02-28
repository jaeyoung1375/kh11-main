package condition2;
//import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		//입력
		int birth = 20001201;
		
		int card = 500;
		
		//처리
		//int price = card + 1250 / 720 / 450 / 0;
		int price;
		int year = birth / 10000;
		int age = 2023 - year + 1;
		
		if(age <= 7 || age >= 65) {//어르신 & 영유아
			price = card + 0;
		}
		else if(age >= 20) {//성인
			price = card + 1250;
		}
		else if(age >= 14) {//청소년
			price = card + 720;
		}
		else {//어린이
			price = card + 450;
		}
		
		//출력
		System.out.println("당신의 나이는 다음과 같습니다");
		System.out.println(age);
		System.out.println("결제 금액은 다음과 같습니다");
		System.out.println(price);
	}
}







