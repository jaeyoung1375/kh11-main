package data2;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		//입력
		int year = 2001;
		
		//처리
		//boolean event = 3의배수 or 5의배수;
		
		//boolean event1 = 3의배수;
		//boolean event2 = 5의배수;
		//boolean event = event1 or event2;
		
		boolean event1 = year % 3 == 0;
		boolean event2 = year % 5 == 0;
		boolean event = event1 || event2;
		//System.out.println(event1);
		//System.out.println(event2);
		
		//출력
		System.out.println(event);
	}
}
