package api.time;

import java.text.DecimalFormat;
import java.text.Format;
import java.time.Duration;
import java.time.LocalTime;

public class Test02_3 {
	public static void main(String[] args) {
		String in = "14:30";
		String out = "15:30";
		
		LocalTime inTime = LocalTime.parse(in);
		LocalTime outTime = LocalTime.parse(out);
		
		Duration duration = Duration.between(inTime, outTime);
		long second = duration.getSeconds();
		//System.out.println("이용시간(초) = " + second);
		long minute = second / 60L;
		System.out.println("이용시간(분) = " + minute);
		
		int pricePerHour = 1000;
		double pricePerMinute = pricePerHour / 60.0;
		
		long price = (long)(pricePerMinute * minute);
		System.out.println("이용요금(원) = " + price);
		
		//(추가) java.text.DecimalFormat 클래스를 사용하여 숫자 형식을 정의
		//- #은 해당 자리가 있으면 출력, 없으면 비워두는 형식
		//- 0은 해당 자리가 있으면 출력, 없으면 0으로 출력하는 형식
		//- ,는 그룹 표시 형식이며 패턴이 자동으로 설정됨
		//- .은 소수점 표시 형식
		Format f = new DecimalFormat("#,##0.00");
		System.out.println(f.format(price));
	}
}






