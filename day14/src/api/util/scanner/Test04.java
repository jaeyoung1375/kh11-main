package api.util.scanner;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//목표 : 단어 형태와 줄 단위 입력을 같이 사용하려면?
		//- .next() 계열 사용 후 .nextLine() 메소드를 부르면 입력이 안됨
		//- 사이에 .nextLine()을 1회 더 추가
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("단어 입력 : ");
		String b = sc.next();
		
		//이전 입력에서 남긴 쓰레기를 제거
		sc.nextLine();
		
		System.out.print("문장 입력 : ");
		String c = sc.nextLine();
		
		sc.close();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		
	}
}
