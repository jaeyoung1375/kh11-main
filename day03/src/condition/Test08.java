package condition;
//import java.lang.*;
public class Test08 {
	public static void main(String[] args) {
		//입력
		int people = 1;
		int day = 1;
		int month = 6;
		
		//계산
		//int price = people * day * 100000;
		//int price = people * day * 100000 * 75 / 100;
		int price;
//		if(month == 6 || month == 7 || month == 8) {//6, 7, 8월에 여행을 간다면
//		if(month >= 6 && month <= 8) {//6월에서 8월 사이에 여행을 간다면
		if(month / 3 == 2) {
			price = people * day * 100000 * 75 / 100;
		}
		else {
			price = people * day * 100000;
		}
		
		//출력
		System.out.println(price);
		
	}
}
