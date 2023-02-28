package condition;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		//국밥 요금 출력 프로그램
		
		int age = 70;
		
		boolean elder = age >= 65;
		
		if(elder == true) {
			System.out.println(3500);
		}
		if(elder == false) {
			System.out.println(7000);
		}
		
	}
}
