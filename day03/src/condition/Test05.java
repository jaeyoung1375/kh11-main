package condition;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		//ex : 성인은 만원, 나머지는 오천원
		
		int age = 15;
		
		boolean adult = age >= 20;
		
		//int price = 10000 or 5000;//??
		int price;
		if(adult) {
			price = 10000;
		}
		else {
			price = 5000;
		}
		
		System.out.println(price);
		
	}
}
