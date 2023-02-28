package api.lang.string;

import java.util.regex.Pattern;

public class Test11 {
	public static void main(String[] args) {
		//목표 : 비밀번호 검사식 만들기
		//- 반드시 1개 이상 포함? (긍정탐색)
		
		String password = "asdfQWER!@#$1234";
		
		int lower=0, upper=0, number=0, special=0;
		
		for(int i=0; i < password.length(); i++) {
			char ch = password.charAt(i);
			//System.out.println(ch);
			if(ch >= 'A' && ch <= 'Z') {//대문자라면
				upper++;
			}
			else if(ch >= 'a' && ch <= 'z') {//소문자라면
				lower ++;
			}
			else if(ch >= '0' && ch <= '9') {//숫자라면
				number++;
			}
			else if(ch == '!' || ch == '@' || ch == '#' || ch == '$') {//특수문자라면
				special++;
			}
		}
		
		String regex = "^[A-Za-z!@#$0-9]{8,16}$";
		
//		if(Pattern.matches(regex, password)) {
		boolean must = lower > 0 && upper > 0 
							&& number > 0 && special > 0;
		if(password.matches(regex) && must) {
			System.out.println("올바른 비밀번호입니다");
		}
		else {
			System.out.println("8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.");
		}
	}
}









