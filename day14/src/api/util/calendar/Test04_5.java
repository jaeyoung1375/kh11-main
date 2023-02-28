package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Test04_5 {
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
			
			c.set(Calendar.DATE, date);
			
			Format f = new SimpleDateFormat("yyyy-MM-dd E");
			
			
			//요일을 구하는 방법
			//1. 숫자로 추출 (1요일~)
			//2. 문자열로 추출
			
			int week = c.get(Calendar.DAY_OF_WEEK);
			
			//if(week == 1 || week == 7) {
			if(week == Calendar.SUNDAY || week == Calendar.SATURDAY) {
				System.out.println(f.format(c.getTime()));
				break;
			}
		}
	}
}








