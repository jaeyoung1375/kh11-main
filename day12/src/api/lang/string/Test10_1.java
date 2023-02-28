package api.lang.string;

import java.util.regex.Pattern;

public class Test10_1 {
	public static void main(String[] args) {
		//날짜 검사 프로그램
		String day = "2000-01-01";
		
		String regex = "^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|(02-(0[1-9]|1[0-9]|2[0-8])))$";
		
		if(Pattern.matches(regex, day)) {
			System.out.println("올바른 날짜");
		}
		else {
			System.out.println("잘못된 날짜");
		}
	}
}
