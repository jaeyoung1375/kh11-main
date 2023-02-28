package data2;
import java.lang.*;
import java.util.Calendar;
public class Test02_2 {
	public static void main(String[] args) {
		//문제 : 출생년도에 따른 성인여부 판정 프로그램
		
		//입력 - 출생년도
		int birth = 2000;
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(year);
		
		//처리 - 나이 → 성인여부
		//나이 = 올해 - 출생년도 + 1
		int age = year - birth + 1;
		System.out.println(age);
		
		//boolean adult = birth >= 2003;
		boolean adult = age >= 20;
		
		//출력 - 성인여부
		System.out.println(adult);
		
	}
}




