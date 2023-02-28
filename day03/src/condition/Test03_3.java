package condition;
import java.lang.*;
public class Test03_3 {
	public static void main(String[] args) {
		//국밥 요금 출력 프로그램
		
		int age = 70;//손님나이
		int price = 7000;//국밥가격
		int rate = 50;//할인율
		
		boolean elder = age >= 65;
		
		if(elder) {
			System.out.println(price * (100 - rate) / 100);
		}
		if(!elder) {
			System.out.println(price);
		}
		
	}
}
