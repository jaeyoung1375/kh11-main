package input;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double cm = sc.nextDouble();
		System.out.println("체중을 입력하세요");
		double kg = sc.nextDouble();
		sc.close();
		
		//계산
		double m = cm / 100;
		double bmi = kg / (m * m);
		
		//출력
		System.out.println("bmi = " + bmi);
		
		if(bmi >= 24.5) {
			System.out.println("과체중");
		}
		else {
			System.out.println("정상");
		}
		
	}
}
