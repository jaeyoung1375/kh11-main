package input;

import java.util.Scanner;

public class Test05_1 {
	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력");
		int korean = sc.nextInt();
		
		System.out.println("영어 점수 입력");
		int english = sc.nextInt();
		
		System.out.println("수학 점수 입력");
		int math = sc.nextInt();
		
		sc.close();
		
		//처리
		int total = korean + english + math;
		//double average = total / 3.0;
		double average = (double)total / 3;
		//double average = total / 3d;
		
		//boolean pass = 국어40이상 && 영어40이상 && 수학40이상 && 평균60이상;
		boolean pass = korean >= 40 
						&& english >= 40 
						&& math >= 40 
						&& average >= 60;
		
		
		//출력
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		if(pass) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}
}
