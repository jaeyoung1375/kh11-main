package data2;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		//목표 : 지하철 무임승차 대상인지 판정
		//- 영유아 (7세 이하)
		//- 어르신 (65세 이상)
		
		//입력
		int age = 65;
		
		//처리
		//boolean free = 7세 이하 또는 65세 이상;
		//boolean free = age <= 7 또는 age >= 65;
		boolean free = age <= 7 || age >= 65;
		//boolean free = !(age >= 8 && age < 65);
		
		//출력
		System.out.println(free);
	}
}





