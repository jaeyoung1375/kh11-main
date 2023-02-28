package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

		//문제점
		//- 오류가 정말 2개밖에 발생하지 않나요?
		//- 장담할 수 없으므로 "통합 처리"하는 방향으로 변경
		
		try {//문제가 발생하리라고 예상되는 지역(플랜 A)
			Scanner sc = new Scanner(System.in);
			
			System.out.print("금액 : ");
			int money = sc.nextInt();
			
			System.out.print("인원 : ");
			int people = sc.nextInt();
			
			sc.close();
			
			int result = money / people;
			int remain = money % people;
			
			System.out.println("1인당 "+result+"원");
			System.out.println("자투리 "+remain+"원");
		}
//		catch(RuntimeException e) {
		catch(Exception e) {//앞으로 모든 예외를 통합할 때 사용
//		catch(Throwable e) {
//		catch(Object e) {//error
			System.err.println("오류가 발생했습니다");
		}
		
		
	}
}












