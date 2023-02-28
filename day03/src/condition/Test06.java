package condition;
//import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
		//입력
		int inHour = 10, inMinute = 0;
		int outHour = 11, outMinute = 10;
		
		//처리
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
		int time = outTime - inTime;
		//System.out.println(time);
		
		int hour = time / 60;
		int minute = time % 60;
		
//		int price = 5000원 or 5000원+추가요금;
		int price;
		if(time < 60) {//이용시간이 1시간 이내라면(~59분까지)
			price = 5000;
		}
		else {//1시간이 넘어간 경우
			int plus = (time-60)/10*500+500;
			price = 5000 + plus;
		}
		
		//출력
		System.out.println("이용시간");
		System.out.println(hour);
		System.out.println(minute);
		System.out.println("이용요금");
		System.out.println(price);
	}
}
