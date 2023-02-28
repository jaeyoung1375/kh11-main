package api.time;

import java.time.Duration;
import java.time.LocalTime;

public class Test02_1 {
	public static void main(String[] args) {
		String in = "14:30";
		String out = "15:40";
		
		LocalTime inTime = LocalTime.parse(in);
		LocalTime outTime = LocalTime.parse(out);
		
		Duration duration = Duration.between(inTime, outTime);
		long second = duration.getSeconds();
		System.out.println("이용시간(초) = " + second);
		
	}
}






