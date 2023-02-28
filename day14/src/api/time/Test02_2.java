package api.time;

import java.time.Duration;
import java.time.LocalTime;

public class Test02_2 {
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
	}
}






