package data;
import java.lang.*;
public class Test07_1 {
	public static void main(String[] args) {
		//입력
		int hour1 = 3 , minute1 = 50;
		int hour2 = 4 , minute2 = 25;
		
		//처리
		int hour = hour1 + hour2;
		int minute = minute1 + minute2;
		
		int fixHour = minute / 60;
		int fixMinute = minute % 60;
		
		int finalHour = hour + fixHour;
		int finalMinute = fixMinute;
		
		//출력
		System.out.println(finalHour);
		System.out.println(finalMinute);
	}
}
