package data2;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		//논리(boolean)
		//- 판정 결과를 저장하기 위한 형태
		//- 반드시 예(true, 참)와 아니오(false, 거짓)만 저장 가능
		
		boolean a = true;
		System.out.println(a);
		
		//예시
		int money = 23000;
		int pizza = 20000;
		int coke = 3500;
		
		//boolean order = false;
		//boolean order = pizza랑 coke를 합친 금액이 money 이하인가요;
		boolean order = pizza + coke <= money;
		System.out.println(order);
		
	}
}



