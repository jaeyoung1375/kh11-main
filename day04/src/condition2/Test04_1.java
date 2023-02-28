package condition2;
//import java.lang.*;
public class Test04_1 {
	public static void main(String[] args) {
		
		//입력
		int time = 3600;
		
		//출력
		if(time < 10) {//10초가 되지 않았다면
			System.out.println("방금 전");
		}
		else if(time < 60) {//60초가 되지 않았다면
			System.out.println(time+"초 전");
		}
		else if(time < 60 * 60) {//1시간이 되지 않았다면
			int minute = time / 60;
			System.out.println(minute+"분 전");
		}
		else if(time < 24 * 60 * 60) {//1일이 되지 않았다면
			int hour = time / 60 / 60;
			System.out.println(hour+"시간 전");
		}
		else if(time < 10 * 24 * 60 * 60) {//10일이 되지 않았다면
			int day = time / 60 / 60 / 24;
			System.out.println(day+"일 전");
		}
		else {
			System.out.println("오래 전");
		}
		
		
		
	}
}
