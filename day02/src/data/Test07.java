package data;
import java.lang.*;
public class Test07 {
	public static void main(String[] args) {
		//입력
		int hour1 = 3 , minute1 = 50;
		int hour2 = 4 , minute2 = 25;
		
		//처리
		int time1 = hour1 * 60 + minute1;
		int time2 = hour2 * 60 + minute2;
		int total = time1 + time2;
		
		int hour = total / 60;
		int minute = total % 60;
		
		//출력
		System.out.println(hour);
		System.out.println(minute);
	}
}
