package data;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		//목표 : Test03을 고치기 쉽도록 프로그램을 개조
		//- 프로그램은 입력 → 처리 → 출력의 구조를 가진다
		
		//입력 : 성인요금, 청소년요금, 성인인원수, 청소년인원수 - 저장
		
		//adultPrice라는 정수 저장 변수를 만들어서 16000을 저장해라!
		int adultPrice = 16000;
		int teenPrice = 10000;
		int adultCount = 2;
		int teenCount = 3;
		
		//처리
		int adultTotal = adultPrice * adultCount;
		int teenTotal = teenPrice * teenCount;
		
		int total = adultTotal + teenTotal;
		
		//출력 : 총 요금
		System.out.println(total);
	}
}
