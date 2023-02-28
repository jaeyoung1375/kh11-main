package condition2;
//import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		
		//입력
		int time = 3600;
		
		//출력
		System.out.println("방금 전");
		
		System.out.println(time+"초 전");
		
		int minute = time / 60;
		System.out.println(minute+"분 전");
		
		int hour = time / 60 / 60;
		System.out.println(hour+"시간 전");
		
		int day = time / 60 / 60 / 24;
		System.out.println(day+"일 전");
		
		System.out.println("오래 전");
		
	}
}
