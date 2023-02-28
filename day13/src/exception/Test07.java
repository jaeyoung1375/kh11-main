package exception;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {

		//문제점 : 개발자는 원래 발생하던 예외 메세지를 보고 싶어한다
		
		try {//문제가 발생하리라고 예상되는 지역(플랜 A)
			Scanner sc = new Scanner(System.in);
			
			System.out.print("금액 : ");
			int money = sc.nextInt();
			if(money <= 0) {//자바가 감지하지 못하는 예외상황
//				Exception ex = new Exception();
//				throw ex;
				throw new Exception("금액은 0 이하가 될 수 없습니다");
			}
			
			System.out.print("인원 : ");
			int people = sc.nextInt();
			if(people < 0) {
				throw new Exception("인원은 음수가 될 수 없습니다");
			}
			
			sc.close();
			
			int result = money / people;
			int remain = money % people;
			
			System.out.println("1인당 "+result+"원");
			System.out.println("자투리 "+remain+"원");
		}
		//예외가 발생하면 반드시 예외 정보가 객체 형태로 전달된다
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//문제점 : 스캐너가 어떨땐 닫히고 어떨땐 안닫히는데?
		
	}
}












