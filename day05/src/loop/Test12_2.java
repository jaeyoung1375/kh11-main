package loop;

import java.util.Scanner;

public class Test12_2 {
	public static void main(String[] args) {
		
		//구구단 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		sc.close();
		
		for(int n = 1; n <= 9; n++) {
			System.out.println(dan + " X " + n + " = " + dan * n);
		}
		
	} 
}
