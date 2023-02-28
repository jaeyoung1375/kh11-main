package data;
import java.lang.*;
public class Test13_1 {
	public static void main(String[] args) {
		//1시간에 1300원인 PC방의 시작,종료시각에 따른 이용요금 계산(10원 단위 절삭)
		
		//입력 : 시간당요금, 시작시각, 종료시각
		int pricePerHour = 1300;
		int startHour = 9, startMinute = 50;
		int finishHour = 13, finishMinute = 35;
		
		//처리
		int startTime = startHour * 60 + startMinute;
		int finishTime = finishHour * 60 + finishMinute;
		int usageTime = finishTime - startTime;
		
		//System.out.println(pricePerHour / 60);
		//System.out.println(pricePerHour / 60.0);
		double pricePerMinute = pricePerHour / 60.0;
		int price = (int) (pricePerMinute * usageTime);
		
		int hour = usageTime / 60;
		int minute = usageTime % 60;
		
		//출력
		System.out.println("이용 시간은 다음과 같습니다");
		System.out.println(hour);
		System.out.println(minute);
		System.out.println("이용 요금은 다음과 같습니다");
		System.out.println(price);
		
		//버림
		int price2 = price / 100 * 100; 
		System.out.println("버림 결과");
		System.out.println(price2);
		
		//반올림 - 49까지는 0으로, 50부터는 100으로 만드는 계산법
		int price3 = (price + 50) / 100 * 100;
		System.out.println("반올림 결과");
		System.out.println(price3);
		
		//올림
		int price4 = (price + 99) / 100 * 100;
		System.out.println("올림 결과");
		System.out.println(price4);
		
	}
}
















