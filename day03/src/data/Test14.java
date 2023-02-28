package data;
import java.lang.*;
public class Test14 {
	public static void main(String[] args) {
		//정수 : byte(1), short(2), int(4), long(8)
		//실수 : float(4), double(8)
		//(주의) 실수는 어떠한 경우에도 정수보다 큽니다
		
		//int a = 2200000000;
		
		int a = 2100000000 + 100000000;//범위 초과
		System.out.println(a);
		
		long b = 2200000000L;//long은 int와 구분하기 위해 표시를 붙임
		System.out.println(b);
		
		long c = 2100000000L + 100000000L;
		System.out.println(c);
		
		double d = 1.934812578971234598172459872493587129348712912;
		float e = 1.934812578971234598172459872493587129348712912F;
		System.out.println(d);
		System.out.println(e);
	}
}














