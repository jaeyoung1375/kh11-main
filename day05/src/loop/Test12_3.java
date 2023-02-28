package loop;

import java.util.Scanner;

public class Test12_3 {
	public static void main(String[] args) {
		
		//구구단 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		for(int n = 1; n <= 9; n++) {
			System.out.print(dan + " X " + n + " = ");
			int answer = sc.nextInt();
		}
		
		sc.close();
	} 
}


