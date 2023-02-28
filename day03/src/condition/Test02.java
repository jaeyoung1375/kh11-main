package condition;

import java.lang.*;

public class Test02 {
	public static void main(String[] args) {
		// 홀짝 판정 프로그램

		// 입력
		int n = 572 * 321;

		//계산
		boolean odd = n % 2 != 0;
		boolean even = n % 2 == 0;

		//출력
		//System.out.println(n);
		if (odd) {
			System.out.println("홀수입니다");
		}
		//if (even) {
		if (!odd) {
			System.out.println("짝수입니다");
		}

	}
}
