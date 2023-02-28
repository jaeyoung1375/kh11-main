package loop2;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		int count = 0;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int n = sc.nextInt();
			
			//if(n == -1) break;// {}가 없어도 한 개의 명령은 구문으로 인식함
			if(n == -1) {
				break;
			}
			else {
				count++;
				total += n;
			}
		}
		
		sc.close();
		
		System.out.println("count = " + count);
		System.out.println("total = " + total);
		double average = (double)total / count;
		System.out.println("average = " + average);
		
	}
}
