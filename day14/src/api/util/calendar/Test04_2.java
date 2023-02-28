package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Test04_2 {
	public static void main(String[] args) {
		//2023년 여름(6~8월) 중 하루 추첨
		Calendar c = Calendar.getInstance();
		
		//월 : 6월부터 8월까지 중 설정
		//일 : 해당하는 달의 실제 날짜 수를 구하여 설정
		Random r = new Random();
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
	}
}








