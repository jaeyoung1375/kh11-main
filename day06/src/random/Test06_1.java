package random;

import java.util.Random;
import java.util.Scanner;

public class Test06_1 {
	public static void main(String[] args) {
		//업다운 게임
		
		//1. 정답 출제(1~1000, 1부터 1000개)
		Random r = new Random();
		int answer = r.nextInt(1000) + 1;
		System.out.println("answer = " + answer);
		
		//2. 정답 맞추기
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int user = sc.nextInt();
		sc.close();
		
		if(answer > user) {//정답이 입력값보다 클 때
			System.out.println("업");
		}
		else if(answer < user) {//정답이 입력값보다 작을 때
			System.out.println("다운");
		}
		else {//나머지 : 정답과 입력값이 같을 때(정답을 맞췄을 때)
			System.out.println("정답");
		}
		
	}
}





