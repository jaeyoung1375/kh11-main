package data2;
import java.lang.*;
public class Test07 {
	public static void main(String[] args) {
		//윤년 계산기
		
		//입력
		int year = 2022;
		
		//처리
		//1. 4의배수면 윤년
		//2. 100의 배수면 1번이라도 윤년이 아님
		//3. 400의 배수면 2번이라도 윤년
		boolean is4 = year % 4 == 0;
		boolean is100 = year % 100 == 0;
		boolean is400 = year % 400 == 0;
		
		//(참고) 논리에서 true와 같냐는 코드는 덧셈의 +0, 곱셈의 *1과 같은 코드이다.
		//boolean leap = 4의 배수이면서 100의 배수면 안되고 400의 배수면;
		//boolean leap = 4의 배수 && 100의 배수가 아님 || 400의 배수;
		//boolean leap = year % 4 == 0 
		//					&& year % 100 != 0 
		//					|| year % 400 == 0;
		//boolean leap = is4 == true && is100 == false || is400 == true;
		boolean leap = is4 && !is100 || is400;
		
		//출력
		System.out.println(leap);
	}
}


