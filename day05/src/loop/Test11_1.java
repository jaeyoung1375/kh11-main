package loop;

import java.util.Scanner;

public class Test11_1 {
	public static void main(String[] args) {
		//5번 입력받아 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		
		for(int i=0; i<5; i++){
			System.out.print("숫자 입력 : ");
			int n = sc.nextInt();
			
			total += n;//합계 누적
			//System.out.println("total = " + total);
		}
		
		sc.close();
		
		//평균
		double average = (double)total / 5;
		System.out.println("평균 : " + average);
		
	}
}
