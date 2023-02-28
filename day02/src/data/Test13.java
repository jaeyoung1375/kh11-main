package data;
import java.lang.*;
public class Test13 {
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
		
	}
}
