package loop;

import java.util.Scanner;

public class Test12_5 {
	public static void main(String[] args) {
		
		//구구단 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		int correct = 0;
		
		for(int n = 1; n <= 9; n++) {
			System.out.print(dan + " X " + n + " = ");
			int answer = sc.nextInt();
			
			//입력한 값(answer)가 정답(dan * n)과 일치하는지 판정
			if(answer == dan * n) {
				//System.out.println("정답");
				correct++;
			}
			else {
				//System.out.println("오답");
			}
		}
		
		sc.close();
		
		System.out.println("정답 개수 : " + correct);
	} 
}


