package exception;

import java.util.Scanner;

public class Test04_1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("날짜 : ");
			String date = sc.next();
			
			sc.close();
			
			String year = date.substring(0, 4);
			String month = date.substring(5, 7);
//			String day = date.substring(8, 10);
			String day = date.substring(8);
			
			int yearValue = Integer.parseInt(year);
			int monthValue = Integer.parseInt(month);
			int dayValue = Integer.parseInt(day);
			
			System.out.println("연도 : " + yearValue);
			System.out.println("월 : " + monthValue);
			System.out.println("일 : " + dayValue);
		}
		catch(Exception e) {
			System.err.println("올바른 날짜가 아닙니다");
		}
	}
}
