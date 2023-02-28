package data2;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		//문제 : 출생년도에 따른 성인여부 판정 프로그램
		
		//입력 - 출생년도
		int birth = 2000;
		
		//처리 - 나이 → 성인여부
		//나이 = 올해 - 출생년도 + 1
		int age = 2022 - birth + 1;
		//System.out.println(age);
		
		//boolean adult = birth >= 2003;
		boolean adult = age >= 20;
		
		//출력 - 성인여부
		System.out.println(adult);
		
	}
}




