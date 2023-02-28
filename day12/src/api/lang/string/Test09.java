package api.lang.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("휴대폰 번호를 입력하세요");
		String id = sc.next();
		sc.close();
		
		String regex = "^01[016789]-[1-9][0-9]{2,3}-[0-9]{4}$";
		
		if(Pattern.matches(regex, id)) {
			System.out.println("올바른 전화번호입니다");
		}
		else {
			System.out.println("잘못된 전화번호입니다");
		}
		
	}
}
