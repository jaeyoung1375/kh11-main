package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test03 {
	public static void main(String[] args) {
		//객체 생성
		Calendar c = Calendar.getInstance();
		
		//기준 날짜로 변경(2023.06.13)
		c.set(2023, 5, 13);//월 설정 주의
		
		//D-100 계산
		c.add(Calendar.DATE, -100);

		Format f = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(f.format(c.getTime()));
	}
}
