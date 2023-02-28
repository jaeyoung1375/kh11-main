package data2;
import java.lang.*;
public class Test06_1 {
	public static void main(String[] args) {
		
		//입력
		int n = 57;
		
		//처리
		boolean has7 = n == 7 || n == 17 || n == 27 || n == 37 ||  
				n == 47 ||  n == 57 || n == 67 ||
				(n >= 70 && n < 80) || n == 87 || n == 97;
		
		//출력
		System.out.println(has7);
		
	}
}
