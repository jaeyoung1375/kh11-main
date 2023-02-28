package loop;

import java.util.Scanner;

public class Test12_8 {
	public static void main(String[] args) {
		
		//구구단 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		int correct = 0;
		int wrong = 0;
		int combo = 0;
		
		long start = System.currentTimeMillis();//현재시각을 숫자로 측정
		
		for(int n = 1; n <= 9; n++) {
			System.out.print(dan + " X " + n + " = ");
			int answer = sc.nextInt();
			
			//입력한 값(answer)가 정답(dan * n)과 일치하는지 판정
			if(answer == dan * n) {
				//System.out.println("정답");
				correct++;
				combo++;
				if(combo >= 2) {
					System.out.println(combo+" combo");
				}
			}
			else {
				//System.out.println("오답");
				//(Q) 틀렸을 때 다시 풀게 하려면?
				n--;
				wrong++;
				combo = 0;
			}
		}
		
		long finish = System.currentTimeMillis();
		
		//System.out.println("start = " + start);
		//System.out.println("finish = " + finish);
		System.out.println(finish - start);//소요 시간(ms)
		double time = (double)(finish - start) / 1000;
		
		sc.close();
		
		System.out.println("정답 개수 : " + correct);
		System.out.println("틀린 개수 : " + wrong);
		System.out.println("소요 시간 : " + time + "s");
		
	} 
}


