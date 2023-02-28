package api.lang.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		sc.close();
		
		String regex = "^[a-z][a-z0-9_]{7,19}$";
		
		if(Pattern.matches(regex, id)) {
			System.out.println("올바른 아이디입니다");
		}
		else {
			System.out.println("아이디는 영문소문자로 시작하며 숫자, _가 포함된 8~20자로 작성하세요");
		}
		
	}
}
