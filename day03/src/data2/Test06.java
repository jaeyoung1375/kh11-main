package data2;
import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
		
		//입력
		int n = 57;
		
		//처리
		//boolean has7 = n이 7, 17, 27, 37, 47, 57, 67, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 87, 97 중 하나인가?
		boolean has7 = n == 7 || n == 17 || n == 27 || n == 37 ||  
				n == 47 ||  n == 57 || n == 67 || n == 70 || 
				n == 71 || n == 72 || n == 73 || n == 74 ||
				n == 75 || n == 76 || n == 77 || n == 78 ||
				n == 79 || n == 87 || n == 97;
		
		//출력
		System.out.println(has7);
		
	}
}
