package random;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
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
		
	}
}
