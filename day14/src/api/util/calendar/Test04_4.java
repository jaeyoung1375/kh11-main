package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Test04_4 {
	public static void main(String[] args) {
		//2023년 여름(6~8월) 중 하루 추첨
		Calendar c = Calendar.getInstance();
		
		//월 : 6월부터 8월까지 중 설정
		//일 : 해당하는 달의 실제 날짜 수를 구하여 설정
		Random r = new Random();
		
		
		while(true) {
			int month = r.nextInt(3) + 6;
			c.set(Calendar.YEAR, 2023);//연도만 교체
			c.set(Calendar.MONTH, month-1);//월만 교체
			
			int max = c.getActualMaximum(Calendar.DATE);//실제 일 수
			
			int date = r.nextInt(max) + 1;
			System.out.println("month = " + month);
			System.out.println("date = " + date);
			
			c.set(Calendar.DATE, date);
			
			Format f = new SimpleDateFormat("yyyy-MM-dd E");
			System.out.println(f.format(c.getTime()));
			
			//요일을 구하는 방법
			//1. 숫자로 추출 (1요일~)
			//2. 문자열로 추출
			
			int week = c.get(Calendar.DAY_OF_WEEK);
			System.out.println("week = " + week);
			
			//if(week == 1 || week == 7) {
			if(week == Calendar.SUNDAY || week == Calendar.SATURDAY) {
				System.out.println("주말");
				break;
			}
			else {
				System.out.println("주중");
			}
		}
	}
}








