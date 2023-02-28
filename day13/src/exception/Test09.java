package exception;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {

		//문제점 : close() 좀 자동으로 해주면 안되나?
		//Java 8+ 부터 등장(try~resource)
		
		try(
			Scanner sc = new Scanner(System.in);
		) {
			
			System.out.print("금액 : ");
			int money = sc.nextInt();
			if(money <= 0) {//자바가 감지하지 못하는 예외상황
				throw new Exception("금액은 0 이하가 될 수 없습니다");
			}
			
			System.out.print("인원 : ");
			int people = sc.nextInt();
			if(people < 0) {
				throw new Exception("인원은 음수가 될 수 없습니다");
			}
			
			int result = money / people;
			int remain = money % people;
			
			System.out.println("1인당 "+result+"원");
			System.out.println("자투리 "+remain+"원");
		}
		//예외가 발생하면 반드시 예외 정보가 객체 형태로 전달된다
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}












