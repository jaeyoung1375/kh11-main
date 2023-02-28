package data;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		//입력
		int jjajang = 6000;
		int champon = 7500;
		int jjajangCount = 5;
		int champonCount = 3;
		
		//처리
		int jjajangTotal = jjajang * jjajangCount;
		int champonTotal = champon * champonCount;
		int total = jjajangTotal + champonTotal; 
		
		//출력
		System.out.println(total);
		
	}
}
