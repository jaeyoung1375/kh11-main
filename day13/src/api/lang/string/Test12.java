package api.lang.string;

import java.util.regex.Pattern;

public class Test12 {
	public static void main(String[] args) {
		//목표 : 비밀번호 검사식 만들기
		//- 반드시 1개 이상 포함? (긍정탐색)
		
		String password = "asdfQWER1234!@#$";
		
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z!@#$0-9]{8,16}$";
		
//		if(Pattern.matches(regex, password)) {
		if(password.matches(regex)) {
			System.out.println("올바른 비밀번호입니다");
		}
		else {
			System.out.println("8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.");
		}
	}
}









