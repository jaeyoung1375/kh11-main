package api.time;

import java.time.LocalTime;

public class Test02 {
	public static void main(String[] args) {
		String in = "14:30";
		String out = "15:30";
		
		LocalTime inTime = LocalTime.parse(in);
		LocalTime outTime = LocalTime.parse(out);
		
		System.out.println("inTime = " + inTime);
		System.out.println("outTime = " + outTime);
	}
}
