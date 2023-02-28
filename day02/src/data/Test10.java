package data;
import java.lang.*;
public class Test10 {
	public static void main(String[] args) {
		//목표 : 연산에 실수가 포함된다면 달라지는 것이 무엇인가?
		//- 실수가 한 개라도 연산과정에 포함된다면 결과는 무조건 실수이다
		
		//예제 : 평균 구하기
		double korean = 70.0;
		double english = 75.0;
		
		double total = korean + english;
		double average = total / 2;
		
		System.out.println(total);
		System.out.println(average);
	}
}
