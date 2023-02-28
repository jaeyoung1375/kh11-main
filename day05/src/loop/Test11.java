package loop;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		//5번 입력받아 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++){
			System.out.print("숫자 입력 : ");
			int n = sc.nextInt();
		}
		
		sc.close();
		
	}
}
