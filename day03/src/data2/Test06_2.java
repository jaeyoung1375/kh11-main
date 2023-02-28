package data2;
import java.lang.*;
public class Test06_2 {
	public static void main(String[] args) {
		
		//입력
		int n = 77;
		
		//처리
		int ten = n / 10;
		int one = n % 10;
		
		//boolean has7 = 십의 자리에 7 또는 일의 자리에 7;
		boolean has7 = ten == 7 || one == 7;
		
		//출력
		System.out.println(has7);
		
	}
}
